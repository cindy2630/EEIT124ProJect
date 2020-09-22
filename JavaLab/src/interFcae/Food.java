package interFcae;

import java.util.Date;

public class Food extends Product implements{
	
	@Override
	public Date 最後使用期限() {
		return this.expireDate;
	}

	
}
