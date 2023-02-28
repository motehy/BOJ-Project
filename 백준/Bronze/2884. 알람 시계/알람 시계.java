import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
        int m = sc.nextInt();
        
        h = (h == 0) ? 24 : h;
        m = (m == 0) ? 60 : m;
        
        if(m == 60){
            h -= 1;
        }
        
        if(m < 45){
            h -= 1;
            m = (60+m) - 45;
        }else{
           m -= 45; 
        }
        h = (h == 24)? 0 : h;
        System.out.println (h +" "+ m);
	}
}