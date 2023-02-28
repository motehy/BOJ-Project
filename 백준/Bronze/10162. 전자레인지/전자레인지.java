import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();  //주어진 초
		int[] times = {300,60,10};  //전자레인지 별 초
		
		
		int rn = 0;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i< times.length; i++){
		    if(i!=0) sb.append(" ");
		    if(T<times[i]){
		        sb.append("0");
		        continue;  
		    } 
		    sb.append(T/times[i]);
		    
		    T = T%times[i];
		}
		
		if(T > 0){
		    sb = new StringBuffer();
		    sb.append("-1");
		} 
		
        System.out.println(sb);
	}
}