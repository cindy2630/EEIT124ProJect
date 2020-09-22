package func;

public class PeopleTest {

	public static void main(String[] args) {
		
		People p = new People();
		p.height = 1.7;
		p.weight = 70;
		double bmi = p.getBMI();
		double b = bmi;
		System.out.println("BMI="+b);
		
		
		double b2 = People.BMI(1.7,70);
		System.out.println("static bmi=" + b2);
		
	}

}
