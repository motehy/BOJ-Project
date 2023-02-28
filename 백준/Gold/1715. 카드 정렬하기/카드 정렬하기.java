import java.util.Scanner;
import java.util.PriorityQueue;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();   //테스트 케이스 수
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<T; i++){
		    pq.add(in.nextInt());
		}
		
		int totnum = 0;
		
		
		while(pq.size()>1){
		    int num = pq.poll() + pq.poll();
		    totnum += num;
		    pq.add(num);
		}
		System.out.println(totnum);
	}
}