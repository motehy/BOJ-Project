import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
        String b= sc.next();
        if(Integer.parseInt(a) < 100 || Integer.parseInt(a) > 1000){
            a= sc.next();
        }
        if(Integer.parseInt(b) < 100 || Integer.parseInt(b) > 1000){
            b= sc.next();
        }
        
        for(int i=b.length()-1; i>=0; i--){
            System.out.println(Integer.parseInt(a) * (b.charAt(i)- '0'));
        }
        System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
	}
}