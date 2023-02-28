import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String amountStr = sc.nextLine();
        String kindStr = sc.nextLine();
        int amount = Integer.parseInt(amountStr);
        int kind = Integer.parseInt(kindStr);
        String[] products = new String[kind];
        for(int i=0; i<kind; i++){
            products[i] = sc.nextLine();
        }
        
        int sum = 0;
        for(int i=0; i<products.length; i++){
            String[] strArr = products[i].split(" ");
            sum += Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[1]);
        }
        
        if(amount == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}