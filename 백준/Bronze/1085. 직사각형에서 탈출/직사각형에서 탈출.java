import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());
		    int w = Integer.parseInt(st.nextToken());
		    int h = Integer.parseInt(st.nextToken());
		    
		    //직사각형 경계선 까지의 거리
		    //1. x
		    //2. y
		    //3. w-x
		    //4. h-y
		    int min = 0;
		    min = x > y? y : x;
		    min = (w-x) > min ? min : (w-x);
		    min = (h-y) > min ? min : (h-y);
		    
		    System.out.println(min);
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
}