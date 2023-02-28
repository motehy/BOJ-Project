import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        if(num == 4 || num == 7){
            System.out.println(-1);
        }else if(num % 5 == 1 || num % 5 ==3){
            System.out.println((num/5)+1);
        }else if(num % 5 == 2 || num % 5 ==4){
            System.out.println((num/5)+2);
        }else if(num % 5 == 0){
            System.out.println(num/5);
        }
	}
}