import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        String outStr = "";
        while(a<0 || a>100){
            a= sc.nextInt();
        }
        
        switch(a/10){
            case(10):case(9):
                outStr = "A";
                break;
            case(8):
                outStr = "B";
                break;
            case(7):
                outStr = "C";
                break;
            case(6):
                outStr = "D";
                break;
            default:
                outStr = "F";
                break;
        }
        
        System.out.println(outStr);
        
	}
}