package encap;

public class CarTest {

	public static void main(String[] args) {
			
		Car c = new Car(' ',"Yaris");
		//c.setModel("Prius");
		//c.model = "Prius";
		//c.price = 1000000;
		String m = c.getModel();
		int p = c.getPrice();
		System.out.println(c.getModel() + "," + c.getPrice());
		System.out.println(c.getColor());
	}

}
