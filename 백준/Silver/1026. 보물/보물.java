import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();      //개행문자(엔터)를 제거하기위해 추가
		String A = in.nextLine();
		String B = in.nextLine();
		
		String[] A_arr = A.split(" ");
		String[] B_arr = B.split(" ");
		
		List<Integer> a_list = Arrays.stream(A_arr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
                
        List<Integer> b_list = Arrays.stream(B_arr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        Collections.sort(a_list);
        Collections.sort(b_list, new Comparator<Integer>(){
            @Override
        	public int compare(Integer o1, Integer o2) {
        		return o2 - o1;
        	}
        });
        
        int rn = 0;
        for(int i=0; i<n; i++){
            rn += a_list.get(i) * b_list.get(i);
        }
        System.out.println(rn);
	}
}