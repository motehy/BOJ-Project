import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kind = in.nextInt();
		int amt_sum = in.nextInt();
		
		List<Integer> amt_list = new ArrayList<>();
		for(int i=0; i<kind; i++){
		    amt_list.add(in.nextInt());
		}
		
		Collections.reverse(amt_list);

        int rn = 0;
        for(int i=0; i<amt_list.size(); i++){
            if(amt_sum / amt_list.get(i) > 0){
                rn += amt_sum / amt_list.get(i);
                amt_sum = amt_sum % amt_list.get(i);
            }else{
                continue;
            }
        }
        System.out.println(rn);
	}
}