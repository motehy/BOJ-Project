import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main
{
    public static Integer[] nA;
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    StringBuilder sb = new StringBuilder();
		    
		    int N = Integer.parseInt(st.nextToken());
		    
		    nA = new Integer[N+1];
		    
		    nA[0] = nA[1] = 0;
		    
		    System.out.println(recur(N));
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
	
	public static int recur(int num){
	    if(nA[num] == null){
	        if(num % 6 == 0){
	            nA[num] = Math.min(recur(num-1), Math.min(recur(num / 3),recur(num /2)))+1;
	        }else if(num % 3 == 0){
    	        nA[num] = Math.min(recur(num / 3),recur(num-1))+1;
    	    }else if(num % 2 == 0){
    	        nA[num] = Math.min(recur(num / 2),recur(num-1))+1;
    	    }else{
    	        nA[num] = recur(num - 1)+1;
    	    }
	    }
	    return nA[num];
	}
	
}