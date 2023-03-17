import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main
{
    public static int[] fibonacci0;
    public static int[] fibonacci1;
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    StringBuilder sb = new StringBuilder();
		    
		    int N = Integer.parseInt(st.nextToken());
		    
		    fibonacci0 = new int[41];
		    fibonacci1 = new int[41];
		    
		    fibonacci0[0] = 1;
		    fibonacci0[1] = 0;
		    fibonacci1[0] = 0;
		    fibonacci1[1] = 1;
		    
		    for(int i=0; i<N; i++){
		        st = new StringTokenizer(br.readLine());
		        int T = Integer.parseInt(st.nextToken());
		        
		        
		        for(int j=2; j<=T; j++){
		            fibonacci0[j] = fibonacci0[j-1] + fibonacci0[j-2];
		            fibonacci1[j] = fibonacci1[j-1] + fibonacci1[j-2];
		        }
		        
		        sb.append(fibonacci0[T])
		          .append(" ")
		          .append(fibonacci1[T])
		          .append("\n");
		    }
		    System.out.println(sb);
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
	
}