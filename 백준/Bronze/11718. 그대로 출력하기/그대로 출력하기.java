import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str="";
	        while((str = br.readLine())!= null){
	            if(!(" ".equals(str.substring(0,1)) 
	                || " ".equals(str.substring(str.length()-1)))
	                && str.length()<=100
	            ){
	                System.out.println(str);
	            }
	        }
	       
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}