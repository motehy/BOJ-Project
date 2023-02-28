import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) {
        try {    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());  
            int sum = 0;
            String str = st.nextToken();
            for(int i=0; i<str.length(); i++){   
                char c = str.charAt(i);    		    
                sum += Integer.parseInt(String.valueOf(c));  
            }
            System.out.println(sum);   
        } catch (Exception e){        
            System.out.println(e.getMessage());     
        }		
    }
}