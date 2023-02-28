import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.nextLine();
		
		Integer[] arr = new Integer[N.length()];
		for(int i=0; i<N.length(); i++){
		    char ch = N.charAt(i);
		    arr[i] = Integer.parseInt(Character.toString(ch));
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		String numstr = "";
		Integer sum = 0;
		for(int i=0; i<arr.length; i++){
		    numstr += String.valueOf(arr[i]);
		    sum += arr[i];
		}
		
		if(!numstr.substring(numstr.length() - 1).equals("0")){
		    System.out.println(-1);
		}else {
		    if(sum % 3 == 0){
		        System.out.println(numstr);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}