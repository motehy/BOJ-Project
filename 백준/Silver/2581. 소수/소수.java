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
	        
	        st = new StringTokenizer(br.readLine());
	        int endNum = Integer.parseInt(st.nextToken());
	        
	        int sum = 0;
	        int firstSosu = 0;
	        
	        startNum = (startNum == 1) ? startNum+1 : startNum;
	        for(int i=startNum; i<=endNum; i++){
	            boolean isSosu = true;  //소수 ?
	            for(int j=2; j<=Math.sqrt(i); j++){
	                if(i % j == 0){ //소수가 아님
	                    isSosu = false;
	                    break;
	                }
	            }
	            if(isSosu){
	                if(firstSosu == 0){
    	                firstSosu += i; //첫번 째 소수 값
    	            }
    	            sum += i;   //소수이면 합산
	            }
	        }
	        
	        if(sum > 0){
	            sb.append(sum).append("\n").append(firstSosu);
	        }else{
	            sb.append(-1);
	        }
	        System.out.println(sb);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}