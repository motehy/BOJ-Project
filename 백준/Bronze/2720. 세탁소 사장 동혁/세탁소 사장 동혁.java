import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int T = Integer.parseInt(st.nextToken());	// 테스트 케이스 수
    		
    		int[] money = {25, 10, 5, 1};   //거스름돈
    		
    		int[][] rs = new int[T][4]; //결과
    		
    		for(int i=0; i<T; i++){
    		    st = new StringTokenizer(bf.readLine());
    		    int C = Integer.parseInt(st.nextToken());
    		    
    		    for(int j=0; j<money.length; j++){
    		        rs[i][j] = C / money[j];
    		        C = C % money[j];
    		    }
    		}
    		
    		for(int i=0; i<rs.length; i++){
    		    System.out.println(rs[i][0] + " " + rs[i][1] + " " + rs[i][2] + " " + rs[i][3]);
    		}
    		
    		
    	
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
}