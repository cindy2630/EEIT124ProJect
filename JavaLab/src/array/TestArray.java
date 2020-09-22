package array;

import javax.xml.namespace.QName;

public class TestArray {

	public static void main(String[] args) {
		/*
		int[] ages = new int [10];
		ages[0] = 2;
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println("length="+ages.length);
		*/
		
		Employee[] emps = new Employee[2];
		
		Employee emp1 = new Employee();
		emp1.empno =1;
		emp1.name = "v";
		emps[0] = emp1; //emp1放在陣列中的第一個
		/*
		Employee emp2 = new Employee();
		emp2.empno = 2; 
		emp2.name ="David";
		emps[1] = emp2 ;
		*/
		
		emps[1] = new Employee();
		emps[1].empno = 2;
		emps[1].name = "David"; //與上面相同意思
		
		for(int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].name);
		}
		
		//int[][] x = new int[5][4];
		int[][] x = { {1,2,3,} , {4,5,6} };
		x[0][2] = 10;//0:第一行,2:第三個
		System.out.println(x[0][2]);
		
		System.out.println("x[0].length="+ x[0].length);
		
		
		int i = 0 ;
		for(int j=0 ; j<3 ; j++) {
			System.out.println(x[i][j]);
		}
		
		 
		
		
	}

}
