import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();   
		
		int totZeroSum = 0;
		//1을 0으로 만들기
		int prevNum = 0;
		for(int i=0; i<str.length(); i++){
		    char c = str.charAt(i);
		    if("1".equals(String.valueOf(c)) && prevNum == 0){
		        totZeroSum++;
		        prevNum = 1;
		    }else if("1".equals(String.valueOf(c)) && prevNum == 1){
		        continue;
		    }else{
		        prevNum = 0;
		    }
		}
		
		int totOneSum = 0;
		prevNum = 1;
		//0을 1로 만들기
		for(int i=0; i<str.length(); i++){
		    char c = str.charAt(i);
		    if("0".equals(String.valueOf(c)) && prevNum == 1){
		        totOneSum++;
		        prevNum = 0;
		    }else if("0".equals(String.valueOf(c)) && prevNum == 0){
		        continue;
		    }else{
		        prevNum = 1;
		    }
		}
		
		System.out.println(totOneSum > totZeroSum ? totZeroSum : totOneSum);
	}
}