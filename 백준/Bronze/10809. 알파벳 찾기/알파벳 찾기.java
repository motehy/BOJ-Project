import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		String input = st.nextToken();
    		StringBuffer sb = new StringBuffer();
    	
		    for(int j=97; j<123; j++){
		        String alpabat = Character.toString((char)j);
	        	for(int i=0; i<input.length(); i++){
    		        String str = Character.toString(input.charAt(i));
    		        if(str.equals(alpabat)){
    		            sb.append(i);
    		            sb.append(" ");
    		            break;
    		        }
    		        if(i==input.length()-1){
    		            sb.append(-1);
    		            sb.append(" ");
    		        }
    		    }
    		}
    		System.out.println(sb);
    	    
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
}