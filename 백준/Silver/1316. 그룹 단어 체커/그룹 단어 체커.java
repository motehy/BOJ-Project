import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int N = Integer.parseInt(st.nextToken());
    		
    		String[] strs = new String[N];
    		for(int i=0; i<N; i++){
    		    st = new StringTokenizer(bf.readLine());
    		    strs[i] = st.nextToken();
    		}
    		
    		int count = 0;
    		for(int i=0; i<strs.length; i++){
    		    String prevStr = "";
    		    boolean continuefl = false;
    		    for(int j=0; j<strs[i].length(); j++){
    		        String str = Character.toString(strs[i].charAt(j));
    		        if(j>0){
    		            if(str.equals(prevStr.substring(prevStr.length()-1, prevStr.length()))){
        		            continue;
        		        }
        		        if(prevStr.contains(str)){
        		            continuefl = true;
        		            break;
        		        }
    		        }
    		        prevStr += str;
    		    }
    		    if(continuefl){
    		        continue;
    		    }
    		    count++;
    		}
    	    System.out.println(count);
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
}