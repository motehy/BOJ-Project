import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    StringBuilder sb = new StringBuilder();
		    
		    int N = Integer.parseInt(st.nextToken());
		    String[] arr = new String[N];
		    
		    for(int i=0; i<N; i++){
		        st = new StringTokenizer(br.readLine());
		        String ox = st.nextToken();
		        int sum = 0;
		        int bonus = 0;
		        for(int j=0; j<ox.length(); j++){
		            String str = Character.toString(ox.charAt(j));
		            if("O".equals(str)){
		                bonus ++;
		                if(j == 0){
		                    //점수 +1
		                    sum++;
		                }else{
		                    String preStr = Character.toString(ox.charAt(j-1));
		                    if("O".equals(preStr)){
		                        sum += bonus;
		                    }else{
		                        bonus = 1;
		                        sum ++;
		                    }
		                }
		            }
		        }
		        sb.append(String.valueOf(sum)).append("\n");
		    }
		    System.out.println(sb);
		    
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
}