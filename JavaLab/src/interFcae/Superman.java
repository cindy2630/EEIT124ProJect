package interFcae;

public class Superman implements Lawyer ,Accountant {
	
	public void 訴訟() {
			
	}
	
	public void 報稅() {
		
	}
	public static void main(String[] args) {
	   Superman superman = new Superman();
	   superman.報稅();
	   superman.訴訟();
		
	}
}
