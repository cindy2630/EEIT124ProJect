package extend;

public class Notebook extends Product{

	public String name;
	public int price;
	public int warrnty;
	
		public Notebook(String name, int price, int warrnty) {
		
		
		super(name,price);
		this.warrnty =warrnty;
		}

		
		public String  desc()  {
			String fromSuperDesc = super.desc();
			String d =fromSuperDesc +",保固 "+this.warrnty+"天";
			return d;
		}
	
	
	
}
