import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		String[] arr = str.split(" ");
		
		long A = Long.parseLong(arr[0]);
		long B = Long.parseLong(arr[1]);
		
		Queue<Long> queue = new LinkedList<>();
		
		queue.add(A*2);
		queue.add((A*10)+1);
		
		int rn = 1;
		while(!queue.isEmpty()){
		    rn++;
		    int size = queue.size();
		    for(int i=0; i<size; i++){
		        long num = queue.poll();
    		    if(num > B) continue;
    		    if(num == B) {
    		        System.out.println(rn);
    		        return;
    		    }
    		    queue.add(num*2);
    		    queue.add((num*10)+1);
		    }
		}
		System.out.println(-1);
	}
}