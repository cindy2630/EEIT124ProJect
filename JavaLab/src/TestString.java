
public class TestString {

	public static void main(String[] args) {
		
		String name = "vincent";
		String name1 = "vincent";
		String name2 = new String("vincent");
		
		System.out.println( "=="  + (name == name2));//比的是記憶體位子
		System.out.println("equals=" + name.equals(name2));//比較字串是否相同
		
		System.out.println("中文ABC".length());
		
		System.out.println("資策會305".indexOf("305"));//從0起算
		System.out.println("資策會305".indexOf("999"));//找不到表示-1
		System.out.println("資策會305".substring(3));//305
		System.out.println("資策會305".substring(3,5));//30
		
		
		
		
		
		
		
		
		
		
		
	}

}
