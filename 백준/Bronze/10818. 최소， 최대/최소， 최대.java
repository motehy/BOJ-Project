import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s = br.readLine();
        st = new StringTokenizer(br.readLine());
        
        int minnum =0;
        int maxnum =0;
        for(int i=0; i<Integer.parseInt(s); i++){
            int value = Integer.parseInt(st.nextToken());
            if(minnum > value){
                minnum = value;
            }
            if(maxnum < value){
                maxnum = value;
            }
            if(minnum == 0 || maxnum == 0){
                minnum = value;
                maxnum = value;
            }
        }
        System.out.println(minnum + " " + maxnum);
	}
}