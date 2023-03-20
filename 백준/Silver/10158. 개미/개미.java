import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main
{
    public static int[][] apart;
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    StringBuilder sb = new StringBuilder();
		    
		    int maxX = Integer.parseInt(st.nextToken());
		    int maxY = Integer.parseInt(st.nextToken());
		    
		    st = new StringTokenizer(br.readLine());
		    int antX = Integer.parseInt(st.nextToken());
		    int antY = Integer.parseInt(st.nextToken());
		    
		    st = new StringTokenizer(br.readLine());
		    int time = Integer.parseInt(st.nextToken());
		    
		    //maxX - abs( maxX - mod( antX + time , 2(maxX)) ) 
            //maxY - abs( maxY - mod( antY + time , 2(maxY)) )
            
            int rX = maxX - Math.abs( maxX - ((antX + time) % (2 * maxX)) ); 
            int rY = maxY - Math.abs( maxY - ((antY + time) % (2 * maxY)) );
		    
		    sb.append(rX).append(" ").append(rY);
		    System.out.println(sb);
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
	
}