import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        String str = br.readLine();
	        int ans = 0;
	        if(" ".equals(str)){
	            System.out.println(0);
	        }else{
	            String[] strs = str.split(" ");
	        
    	        ans = strs.length;
    	        if("".equals(strs[0]) || "".equals(strs[strs.length-1])){
    	            ans--;
    	        }
    	        System.out.println(ans);
	        }
	        
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}