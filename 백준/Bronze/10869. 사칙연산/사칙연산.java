import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 < 1 || num1 > 10000){
            num1 = sc.nextInt();
        }
        if(num2 < 1 || num2 > 10000){
            num2 = sc.nextInt();
        }
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
    }
}