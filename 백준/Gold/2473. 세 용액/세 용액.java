import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main
{
    public static int N;
    public static long[] ans = new long[3];
    public static long[] numbers = null;
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        N = Integer.parseInt(br.readLine());
	        
	        numbers = new long[N];
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for(int i=0; i<N; i++){
	            numbers[i] = Long.parseLong(st.nextToken());
	        }
	        
	        Arrays.sort(numbers);
	        
	        solution();
	        
	        sb.append(ans[0])
	          .append(" ")
	          .append(ans[1])
	          .append(" ")
	          .append(ans[2]);
	        System.out.println(sb);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void solution(){
	    long diff = Long.MAX_VALUE;
	    for(int i=0; i<numbers.length-1; i++){
	        int left = i+1;
	        int right = N-1;
	        
	        while(left < right){
    	        long sum = numbers[i] + numbers[left] + numbers[right];
    	        long absSum = Math.abs(sum);
    	        if(absSum < diff){
    	            diff = absSum;
    	            ans[0] = numbers[i];
    	            ans[1] = numbers[left];
    	            ans[2] = numbers[right];
    	        }
    	        
    	        if(sum > 0){
    	            right--;
    	        }else{
    	            left++;
    	        }
    	    }
	    }
	}
}