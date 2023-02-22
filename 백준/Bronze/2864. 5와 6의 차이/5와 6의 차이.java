import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    String s = br.readLine();
    	    String[] str = s.split(" ");
    	    int[] minArr = new int[2];
    	    int[] maxArr = new int[2];
    	    for(int i=0; i<str.length; i++){
    	        String baseS = str[i];
    	        baseS.replace("6", "5");
    	        minArr[i] = Integer.parseInt(baseS.replace("6", "5"));
    	        
    	        baseS.replace("5", "6");
    	        maxArr[i] = Integer.parseInt(baseS.replace("5", "6"));
    	    }
    	    
    	    int minNum = 0;
    	    int maxNum = 0;
    	    for(int i=0; i<minArr.length; i++){
    	        minNum += minArr[i];
    	        maxNum += maxArr[i];
    	    }
    	    
    	    StringBuffer sb = new StringBuffer();
    	    sb.append(minNum);
    	    sb.append(" ");
    	    sb.append(maxNum);
    	    
    	    System.out.println(sb);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
}