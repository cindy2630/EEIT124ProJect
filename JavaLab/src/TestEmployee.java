
public class TestEmployee {

	public static void main(String[] args) {
		int age = 1;
		Employee emp = new Employee();//在記憶體中產生區塊,放在Employee
		emp.empno = 1;
		emp.name = "Vincent";
		
		//System.outprintln(emp.name); //null空值

	Employee emp2 = new Employee();//0900
	emp2.empno = 2;
	emp2.name = "David";
	emp2 =emp; //emp2=0800
	
	emp = null;
	emp2 = null;// 給予空值 會錯誤 20行找不到內容
	
//	System.out.println(emp2.name);
	//System.out.println
	
	System.out.println( emp == emp2);
	
	}
	
}
