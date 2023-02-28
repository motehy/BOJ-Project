import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        //불기 연도
        int y = sc.nextInt();
        if(y <1000 || y > 3000){
            y = sc.nextInt();
        }
        //불기 = 서기 + 543
        System.out.println(y - 543);
	}
}