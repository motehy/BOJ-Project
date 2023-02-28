import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
        String[] str = inp.split(" ");
        while(!validateNum(str)){
            inp = sc.nextLine();
            str = inp.split(" ");
        }
        if(Integer.parseInt(str[0]) > Integer.parseInt(str[1])){
            System.out.println(">");
        }else if(Integer.parseInt(str[0]) < Integer.parseInt(str[1])){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
	}
    public static boolean validateNum(String[] str){
        if(Integer.parseInt(str[0]) < -10000 || Integer.parseInt(str[0]) > 10000){
            return false;
        }
        if(Integer.parseInt(str[1]) < -10000 || Integer.parseInt(str[1]) > 10000){
            return false;
        }
        return true;
    }
}