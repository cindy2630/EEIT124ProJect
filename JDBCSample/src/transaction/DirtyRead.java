package transaction;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DirtyRead {

	public static void main(String[] args) {
		



		try ( Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@//localhost:1521/xepdb1",
				"scott", "tiger");
			  Statement stmt = conn.createStatement()
		) {
			conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			//conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
			conn.setAutoCommit(false);
			System.out.println("交易開始");
			System.out.println("breakpoint 1 here");
			//設定中斷點於此,debug停於此時,執行以下SQL
			/*  在SQL Studio中執行以下指令 
		       begin transaction
		       select * from emp where empno=1001
		       update emp set SALARY= salary+100 where EMPNO=1001
		       select * from emp where empno=1001
		    */
			try(ResultSet resultSet = stmt.executeQuery("select * from emp")){
				BigDecimal totalSalary = new BigDecimal("0");
				while (resultSet.next()) {
					BigDecimal sal = resultSet.getBigDecimal("salary");
					totalSalary = totalSalary.add(sal);
					int empno = resultSet.getInt("empno");
					System.out.println(empno+":salary="+sal);
				}
				System.out.println("報告副總,公司薪水總和為"+totalSalary);
			}catch (SQLException ex){
				ex.printStackTrace();
			}

			/*
			 * 執行rollback;
			 * 利用 select sum(salary) from EMP檢查結果
			 */
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
