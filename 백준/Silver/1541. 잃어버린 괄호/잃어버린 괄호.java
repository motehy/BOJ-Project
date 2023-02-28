import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] answer = str.split("-");
		
        int rn = 0;
        for(int i=0; i<answer.length; i++){
		    if(answer[i].contains("+")){
		        String[] str2 = answer[i].split("\\+");
		        int sum = 0;
		        for(int j=0; j<str2.length; j++){
		            sum += Integer.parseInt(str2[j]);
		        }
		        if(i == 0){
	                rn = sum; continue;
		        }
		        if(answer.length > 1){
		            rn -= sum;
		        }else{
		            rn += sum;
		        }
		    }else{
		        if(i == 0){
	                rn = Integer.parseInt(answer[i]); continue;
		        }
		        rn -= Integer.parseInt(answer[i]);
		    }
		}
        System.out.println(rn);
	}
}