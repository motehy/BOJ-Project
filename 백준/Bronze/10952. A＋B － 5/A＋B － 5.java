import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        boolean whileContinue = true;
        List<String> rlstList = new ArrayList<String>();
        int listCnt = 0;
        while(whileContinue){
            String str = sc.nextLine();
        
            String[] strs = str.split(" ");
            
            if(Integer.parseInt(strs[0]) == 0 && Integer.parseInt(strs[1]) == 0){
                whileContinue = false;
            }else{
                rlstList.add(str);
            }
        }
        
        for(int i=0; i<rlstList.size(); i++){
            String[] strs = rlstList.get(i).split(" ");
            System.out.println(Integer.parseInt(strs[0])+Integer.parseInt(strs[1]));
        }
	}
}