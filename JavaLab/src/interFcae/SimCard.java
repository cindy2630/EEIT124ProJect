package interFcae;

import java.util.Date;

public class SimCard  extends Product implements Expirable,Warrantable{

		private Date expireDate;
		
		
		
	public SimCard(String name, int price, Date expireDate) {
			super(name, price);
			this.expireDate = expireDate;
		}

	@Override
	public int 保固天數() {
		
		return 7;
	}

	@Override
	public Date 最後使用期限() {
		
		return this.expireDate;
	}
	
	@Override
	public String desc( ) {
		String deString = super.desc();
		return deString +",開卡期限="+this.expireDate+",可以使用="+保固天數()+ "天";
	}

}
