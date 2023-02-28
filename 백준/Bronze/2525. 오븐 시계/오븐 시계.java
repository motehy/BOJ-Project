import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        //현재 시간
        String[] strArr = str.split(" ");
        //소요 시간
        int time = sc.nextInt();
        
        int pt = (Integer.parseInt(strArr[1]) + time)/60;
        int minute = (Integer.parseInt(strArr[1]) + time) % 60;
        
        int hour = (Integer.parseInt(strArr[0])+ pt)%24;
        System.out.println(hour + " " + minute);
	}
}
