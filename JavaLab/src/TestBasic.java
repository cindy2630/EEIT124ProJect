import java.nio.channels.InterruptedByTimeoutException;

public class TestBasic {

	public static void main(String[] args) {
		{

			// TODO Auto-generated method stub
			short salary;
			long salary2;
			salary2 = 99999;
			salary = 20000;
			System.out.println(salary);

			char a = '中';
			System.out.println(a);

			boolean b = true;
			System.err.println("會嗎" + b);

			System.out.println("\'Hello\'\\\r\n\'\"");

			double z = 10.5;

			int z1 = (int) z;

			System.out.println(z1);

			
		}
//      format: ctrl+ shit + f
		int age = 20;
		if (age >= 30) {
			System.out.println("壯年");
		}else	if (age >= 18) {
			System.out.println("成年");
			
		}else {
				System.out.println("未成年");
		}
		
		
	
		int classrom = 305;
		switch (classrom) {
			case 204:
				System.out.println("人數大於等於30");			
				break;
			case 305:
				System.out.println("人數小於30大於等於20人");
				break;
			default:
				System.out.println("default 其他");	
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				continue;
			}
			if(i >=50) {
				break;
			}
			System.out.println(i);
			System.out.println("sum="+sum + "+" + i);
			sum = sum+i ; //i= 1 : sum= 0+1=1
						  //i= 2 : sum=1+2=3
			
			
		}
		System.out.println("總和="+sum);
		
		
		
		
		
	
		
		
		
		
		
		
  }

}
