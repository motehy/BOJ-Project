import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = Integer.parseInt(num);
        String[] strArr = new String[n];
        for(int i=0; i<n; i++){
            strArr[i] = sc.nextLine();
        }
        for(int i=0; i<strArr.length; i++){
            String[] arr = strArr[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            
            System.out.println(a+b);
        }
        
	}
}
