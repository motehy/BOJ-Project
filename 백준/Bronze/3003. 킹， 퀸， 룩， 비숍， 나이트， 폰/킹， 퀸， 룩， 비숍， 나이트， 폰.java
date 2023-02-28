import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bishop = sc.nextInt();
        int night = sc.nextInt();
        int pon = sc.nextInt();
        int[] rslt = new int[6];
        rslt = validateNum(king,queen,look,bishop,night,pon);
        System.out.println(rslt[0]+" "+rslt[1]+" "+rslt[2]+" "+rslt[3]+" "+rslt[4]+" "+rslt[5]);
	}
    
    public static int[] validateNum(int king, int queen, int look, int bishop, int night, int pon){
        int[] arr = new int[6];
        //king 개수
        if(king < 0 || king > 10){
            king= sc.nextInt();
        }
        //queen 개수
        if(queen < 0 || queen > 10){
            queen= sc.nextInt();
        }
        //look 개수
        if(look < 0 || look > 10){
            look= sc.nextInt();
        }
        //bishop 개수
        if(bishop < 0 || bishop > 10){
            bishop= sc.nextInt();
        }
        //night 개수
        if(night < 0 || night > 10){
            night= sc.nextInt();
        }
        //pon 개수
        if(pon < 0 || pon > 10){
            pon= sc.nextInt();
        }
        
        arr[0] = 1-king;
        arr[1] = 1- queen;
        arr[2] = 2-look;
        arr[3] = 2- bishop;
        arr[4] = 2-night;
        arr[5] = 8-pon;
        
        return arr;
    }
}