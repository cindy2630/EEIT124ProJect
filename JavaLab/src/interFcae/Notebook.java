package interFcae;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Notebook extends Product implements Warrantable{

	@Override
	public int 保固天數(){
		
		return this.warrnty;
	}
	

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
