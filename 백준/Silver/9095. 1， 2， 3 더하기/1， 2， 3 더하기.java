import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main
{
    public static Integer[] dp;
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    StringBuilder sb = new StringBuilder();
		    
		    int N = Integer.parseInt(st.nextToken());
		    
		    dp = new Integer[121];
		    //dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
		    dp[1] = 1;
		    dp[2] = 2;
		    dp[3] = 4;
		    dp[4] = 7;
		    //N <= 11
		    
		    for(int i=0; i<N; i++){
		        st = new StringTokenizer(br.readLine());
		        int T = Integer.parseInt(st.nextToken());
		        
		        for(int j=4; j<=T; j++){
		            dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
		        }
		        
		        sb.append(dp[T]).append("\n");
		    }
		    System.out.println(sb);
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
	
}