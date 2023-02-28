import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();  //로프 갯 수
		
		List<Integer> lopeList = new ArrayList<>();
		for(int i=0; i<N; i++){
		    int lope_weight = in.nextInt();
		    lopeList.add(lope_weight);
		}
		
		Collections.sort(lopeList);
		
		
		int rn = 0;
		for(int i=0; i<N; i++){
		    if(rn < lopeList.get(i) * (N-i) ){
		        rn = lopeList.get(i) * (N-i);
		    }
		}
        System.out.println(rn);
	}
}