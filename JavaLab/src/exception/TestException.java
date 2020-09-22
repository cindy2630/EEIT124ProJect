package exception;

import jdk.nashorn.internal.ir.CatchNode;

public class TestException {
	
	public static void main(String[] args) {
		try {
		int a =1 ;
		int b =a /1;
		int[] x = {};
		System.out.println(x[0]);
		System.out.println("done");
		}catch (ArithmeticException ex) {
			System.out.println("錯誤:除以0");
			ex.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("陣列操作錯誤");
			ex.printStackTrace();
		}catch (Exception ex) {
			System.out.println("Exception");
			ex.printStackTrace();
		}
		}finally {
			System.out.println("finally一定會被執行區塊");
		}
		}

}
