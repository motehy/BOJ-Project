import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int N = Integer.parseInt(st.nextToken());
		    
		    String[] sArr = (br.readLine()).split(" ");
		    
		    int count =0;
		    for(int i=0; i<sArr.length; i++){
		        int num = Integer.parseInt(sArr[i]);
                if(num == 2){
		            count++;
		            continue;
		        }
		        for(int j=2; j<num; j++){
		            if(num%j == 0){
		                break;
		            }
		            if(j == num-1){
		                count++;
		            }
		        }
		    }
		    
		    System.out.println(count);
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
}