import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        double[] nArr = new double[N];
	        for(int i=0; i<N; i++){
	            nArr[i] = Double.parseDouble(st.nextToken());
	        }
	        
	        Arrays.sort(nArr);
	        
	        double sum = 0.0;
	        for(double n : nArr){
	            sum += n;
	        }
	        
	        double ans =0;
	        ans = Math.round((sum/N) / nArr[nArr.length-1] * 100 * 100) /100.0;
	        
            System.out.print(ans);
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}
