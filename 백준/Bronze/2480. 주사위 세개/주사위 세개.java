import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        String[] numbers = str.split(" ");
        int number1 = Integer.parseInt(numbers[0]);
        int number2 = Integer.parseInt(numbers[1]);
        int number3 = Integer.parseInt(numbers[2]);
        
        if(number1 == number2 && number2 == number3){
            System.out.println(10000+(number1*1000));
        }else if(number1 == number2){
            System.out.println(1000+(number1*100));
        }else if(number2 == number3){
            System.out.println(1000+(number2*100));
        }else if(number1 == number3){
            System.out.println(1000+(number3*100));
        }else{
            if(number1 > number2 && number1 > number3){
                System.out.println(number1*100);
            }else if(number2 > number1 && number2 >= number3){
                System.out.println(number2*100);
            }else{
                System.out.println(number3*100);
            }
        }
	}
}