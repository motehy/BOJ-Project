import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        
	        int g = N/5;
	        N = N % 5;
	        
	        
	        while(N >= 0){
                if(N % 2 == 0){
                    System.out.println(g + N/2);
                    N = -1;
                }else{
                    if(g > 0){
                        g -= 1;
                        N += 5;
                    }else{
                        System.out.println(-1);
                        N = -1;
                    }
                }
	        }
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}