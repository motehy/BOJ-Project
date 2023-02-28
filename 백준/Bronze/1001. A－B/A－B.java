import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 >= 10 || num2 >= 10 || num1 <= 0 || num2 <= 0){
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        System.out.println(num1-num2);
    }
}