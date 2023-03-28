import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        
	        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	        for(int i=0; i<N; i++){
	            StringTokenizer st = new StringTokenizer(br.readLine());
	            linkedHashSet.add(st.nextToken());
	        }
	        String[] sArr = linkedHashSet.toArray(new String[] {});
	        Arrays.sort(sArr);
	        Arrays.sort(sArr, (s1, s2) -> s1.length() - s2.length());
            
            for(String s: sArr){
                System.out.println(s);
            }
	        
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}