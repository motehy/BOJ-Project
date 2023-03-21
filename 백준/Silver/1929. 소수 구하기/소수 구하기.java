import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    StringTokenizer st = new StringTokenizer(br.readLine());
    	    StringBuilder sb = new StringBuilder();
    	    
    	    int startNum = Integer.parseInt(st.nextToken());
    	    int endNum = Integer.parseInt(st.nextToken());
    	    
    	    startNum = (startNum == 1) ? startNum+1 : startNum;
    	    for(int i=startNum; i<=endNum; i++){
    	        //소수 구하기
    	        boolean isSosu = true;
    	        for(int j=2; j<=Math.sqrt(i); j++){
    	            if(i % j == 0){
    	                isSosu = false;
    	                break;
    	            }
    	        }
    	        if(isSosu){
    	            sb.append(i).append("\n");
    	        }
    	    }
    	    System.out.println(sb);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}