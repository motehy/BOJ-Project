import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		in.nextLine();
		String[] arr = new String[cnt];
		for(int i=0; i<cnt; i++){
		    arr[i] = in.nextLine();
		}
		Arrays.sort(arr, (String s1, String s2)-> s2.length() - s1.length());
		
		int[] nums = new int[26];
		for(int i=0; i<arr.length; i++){
		    String str = arr[i];
		    int idx = str.length() -1;
		    
		    for(int j=0; j<str.length(); j++){
		        char c = str.charAt(j);
		        nums[(int)c-65] += (int)(Math.pow(10, idx));
		        idx--;
		    }
		}
        Integer[] rsltArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        int rn = 0;
        int n = 9;
		Arrays.sort(rsltArr, Collections.reverseOrder());
		for(int i=0; i<rsltArr.length; i++){
		    if(rsltArr[i] == 0) continue;
		    rn += rsltArr[i]*n;
		    n--;
		}
		System.out.println(rn);
	}
}