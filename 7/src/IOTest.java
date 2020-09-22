
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IOTest {
    public static void main(String[] args) throws MalformedURLException {
        //http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld
        //此將此網址回傳的結果示在Console中
    	URL url = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");
        try (InputStream is = url.openStream();//打開
        		InputStreamReader isr = new InputStreamReader(is, "UTF8");//讀成中文
        		BufferedReader br = new BufferedReader(isr);)//放到緩衝區
        {
        	int a = br.read();
        	while(a != -1) {
        		System.out.print((char)a);
        		a = br.read();
        		}

        	}catch (Exception e) {
				// TODO: handle exception
			}
		}
    }

