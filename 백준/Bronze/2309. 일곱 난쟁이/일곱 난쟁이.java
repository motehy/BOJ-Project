import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main
{
    public static int[] dwarfs;
    public static int minusN = 0;
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        dwarfs = new int[9];
	        int sum = 0;
	        for(int i=0; i<9; i++){
	            dwarfs[i] = Integer.parseInt(br.readLine());
	            
	            sum += dwarfs[i];
	        }
	        Arrays.sort(dwarfs);
	        minusN = sum - 100;
	        
	        findTwoDwarfs(0, dwarfs.length-1);
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void findTwoDwarfs(int start, int end){
	    boolean isFinish = false;
	    while(!isFinish){
	        if(dwarfs[start]+ dwarfs[end] == minusN){
	            isFinish = true;
	        }else if(dwarfs[start] + dwarfs[end] > minusN){
	            end--;
	        }else if(dwarfs[start] + dwarfs[end] < minusN){
	            start++;
	        }
	    }
	    
	    for(int i=0; i<9; i++){
	        if(!(i == start || i == end)){
	            System.out.println(dwarfs[i]);
	        }
	    }
	}
}