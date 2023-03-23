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
	        
	        int min = 1;
	        
	        for(int i=0; i<numbers.length; i++){
	            int number = numbers[i];
	            
	            if(min >= number){
	                min += number;
	            }else{
	                break;
	            }
	        }
	        System.out.println(min);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}