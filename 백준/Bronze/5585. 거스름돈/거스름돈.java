import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pay = in.nextInt();   //지불할 돈
		
		int mypay = 1000;   //철수가 가지고 있는 돈
		
		int change = mypay - pay;
		
		//거스름 돈 500엔, 100엔, 50엔, 10엔, 5엔, 1엔
		int[] arr = {500, 100, 50, 10, 5, 1};
		
		int rn = 0;
		for(int i=0; i<arr.length; i++){
		    if(change < arr[i]) continue;
		    
		    rn += (change/arr[i]);
		    change = (change % arr[i]);
		}
		
        
        System.out.println(rn);
	}
}