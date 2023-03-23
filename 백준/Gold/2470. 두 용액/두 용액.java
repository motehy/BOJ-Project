import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        int N = Integer.parseInt(st.nextToken());
	        
	        st = new StringTokenizer(br.readLine());
	        int[] numbers = new int[N];
	        for(int i=0; i<N; i++){
	            numbers[i] = Integer.parseInt(st.nextToken());
	        }
	        
	        Arrays.sort(numbers);
	        
	        int idx1 = 0, idx2 = numbers.length-1, sum = Integer.MAX_VALUE;
	        int ans1 = 0, ans2 = 0;
	        while(idx1 < idx2){
	            if(Math.abs(sum) > Math.abs(numbers[idx1] + numbers[idx2])){
	                sum = numbers[idx1] + numbers[idx2];
	                ans1 = numbers[idx1];
	                ans2 = numbers[idx2];
	            }
	            
	            if(numbers[idx1] + numbers[idx2] > 0){
	                idx2--;
	            }else{
	                idx1++;
	            }
	        }
	        System.out.println(ans1 +" "+ ans2);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}