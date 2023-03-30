import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main
{
    public static int[] nArr;
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        nArr = new int[N];
	        for(int i=0; i<nArr.length; i++){
	            nArr[i] = Integer.parseInt(st.nextToken());
	        }
	        Arrays.sort(nArr);
	        
	        int M = Integer.parseInt(br.readLine());
	        st = new StringTokenizer(br.readLine());
	        
	        for(int i=0; i<M; i++){
	            System.out.println(findValue(Integer.parseInt(st.nextToken())));
	        }
	        
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static int findValue(int baseNum){
	    int low = 0;
	    int high = nArr.length-1;
	    int mid = (low + high) / 2;
	    
	    while(low<=high){
	        mid = (low + high) / 2;
	        if(nArr[mid] == baseNum){
	            return 1;
	        }else if(nArr[mid] > baseNum){
	            high = mid -1;
	        }else if(nArr[mid] < baseNum){
	            low = mid + 1;
	        }
	    }
	    return 0;
	}
}