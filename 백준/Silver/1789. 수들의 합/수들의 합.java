import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long S = in.nextLong();   //자연수의 합
		
		long sum = 0;
		StringBuffer sb = new StringBuffer();
		for(long i=1; i<=S; i++){
		    if(S == 1 ){
		        sb.append(1);
		        break;
		    }
		    if(sum+i < S){
		        sum += i;
		    }else if(sum+i > S){
		        sb.append((i -1));
		        break;
		    }
		}
		
		
        System.out.println(sb);
	}
}