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
		    
		    int num1 = Integer.parseInt(st.nextToken());
		    int num2 = Integer.parseInt(st.nextToken());
		    
		    //최대 공약수
		    int a = gcd(num1, num2);
		    //최소 공배수
		    int b = lcm(num1, num2);
		    
		    sb.append(a)
		      .append("\n")
		      .append(b);
		    System.out.println(sb);
		    
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
	}
	
	public static int gcd(int a, int b){
	    //y -> r
	    //r -> x
	    int r = a % b;
	    
	    while(r > 0){
	        a = b;
	        b = r;
	        r = a%b;
	    }
	    
	    return b;
	}
	
	public static int lcm(int a, int b){
	    int n1 = a;
	    int n2 = b;
	    while(n1 != n2){
	        if(n1 > n2){
	            n2 += b;
	        }else{
	            n1 += a;
	        }
	    }
	    return n1;
	}
	
}