import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
    public static int[] dwarfs;
    public static int minusN = 0;
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int N = Integer.parseInt(br.readLine());
	        
	        String[] strs = new String[N];
	        for(int i=0; i<N; i++){
	            strs[i] = br.readLine();
	        }
	        
	        //문자열 반복문
	        for(int i=0; i<strs.length; i++){
	            String str = strs[i];
	            int cnt = 0;
	            for(int j=0; j<str.length(); j++){
	                char ch = str.charAt(j);
    	            String oneStr = Character.toString(ch);
    	            if(j == 0 && ")".equals(oneStr)){
    	                cnt = -1;
    	                break;
    	            }
    	            if("(".equals(oneStr)){
    	                cnt++;
    	            }else{
    	                cnt--;
    	            }
    	            if(cnt<0){
    	                break;
    	            }
	            }
	            if(cnt == 0){
	                System.out.println("YES");
	            }else{
	                System.out.println("NO");
	            }
	        }
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}