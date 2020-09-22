
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {

         People p1 = new People("001",20);
         People p2 = new People("002",30);
         People p3 = new People("003",45);
         //實作1:請實作一個泛型的Map中的key值為people的id，value為people物件，將上述三個people放入Map中
         
         Map<String,People> map = new HashMap<String,People>();
         map.put(p1.getName(),p1);
         map.put(p2.getName(),p2);
         map.put(p3.getName(),p3);

    
 
         //實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡
 		int size=map.size();
        int sum=0;
 		Set entrySet = map.entrySet();
		for (Entry<String,People> e : map.entrySet()) {
			Map.Entry entry = (Map.Entry)e;
			sum +=((People) entry.getValue()).getAge();
	
		}
		System.out.println("平均年齡:"+sum/size);
		
	
	}
}
         

    

