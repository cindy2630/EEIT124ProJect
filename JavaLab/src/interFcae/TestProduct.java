package interFcae;

public class TestProduct {

	public static void main (String[] args ) {
		Product p = new Product("USB",500);
		String desc = p.desc();
		System.out.println(desc);
		
		Notebook n = new Notebook("Asus", 20000, 365);
	
		System.out.println(n.desc());
	}
}
