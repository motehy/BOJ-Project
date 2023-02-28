import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ex1 = sc.nextLine();
        String ex2 = sc.nextLine();
        
        String[] ex1s = ex1.split(" ");
        String[] ex2s = ex2.split(" ");
        
        for(int i=0; i< ex2s.length; i++){
            if(Integer.parseInt(ex2s[i]) < Integer.parseInt(ex1s[1])){
                System.out.print(ex2s[i]);
                if(i != ex2s.length-1){
                    System.out.print(" ");
                }
            }
        }
	}
}