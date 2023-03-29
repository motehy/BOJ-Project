import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        String str = br.readLine();
	        
	        str = str.toLowerCase();
	        
	        int[] alphabet = new int[26];
	        
	        for(int i=0; i<str.length(); i++){
	            char ch = str.charAt(i);
	            alphabet[(int)ch - 97]++;
	        }
	        
	        String ans = "";
	        int maxNum = 0;
	        boolean samefl = false;
	        for(int i=0; i<alphabet.length; i++){
	            if(maxNum < alphabet[i]){
	                maxNum = alphabet[i];
	                samefl = false;
	                ans = Character.toString((char)(i + 97));
	            }else if(maxNum == alphabet[i] && alphabet[i] > 0){
	                samefl = true;
	                ans = Character.toString((char)(i + 97));
	            }
	        }
	        
	        System.out.println(samefl ? "?" : ans.toUpperCase());
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}