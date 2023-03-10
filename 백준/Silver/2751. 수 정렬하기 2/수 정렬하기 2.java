import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    StringBuilder sb = new StringBuilder();
		    
		    int N = Integer.parseInt(st.nextToken());
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int i=0; i<N; i++){
		        st = new StringTokenizer(br.readLine());
		        int num = Integer.parseInt(st.nextToken());
		        list.add(num);
		    }
		    Collections.sort(list);
		    for(int i=0; i<list.size(); i++){
		        sb.append(list.get(i)).append('\n');
		    }
		    System.out.println(sb);
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
}