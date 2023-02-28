import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean finish = false;
		List<String> list = new ArrayList<>();
		while(!finish){
		    String str = in.nextLine();
		    if("0 0 0".equals(str)){
		        finish = true;
		        break;
		    }
		    list.add(str);
		}
		for(int i=0; i<list.size(); i++){
		    String[] arr = list.get(i).split(" ");
		    int num0 = Integer.parseInt(arr[0]);
		    int num1 = Integer.parseInt(arr[1]);
		    int num2 = Integer.parseInt(arr[2]);
		    int garbage = num2 % num1 > num0 ? num0 : num2 % num1;
		    //Case 1: 14
		    System.out.println("Case "+(i+1)+": "+ (((num2 / num1) * num0) + (garbage)));
		}
	}
}