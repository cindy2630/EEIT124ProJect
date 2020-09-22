package encap;

public class Car {

	private String model;
	private int price;
	private char color;
	
	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	//沒有定義回傳直,方法名稱跟類別名稱依樣
	public Car (char color,String model) {
		//this.model = model;
		setModel(model);
		this.color = color;
	}
	
	public Car() {
		this('R',"Prius");
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		if(model.equals("Yaris")) {
			this.price =575000;
		}else if ( model.equals("Prius")) {
			this.price = 1099000 ;
		}else {
			this.price = 0;
			System.out.println("錯誤的型號,價格為0");			
	}
		
	}
	
	public int getPrice() {
		return this.price;
	}
	
}
