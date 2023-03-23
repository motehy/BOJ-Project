import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;
public class Main
{
    private static int word_cnt = 0;
    private static int learning = 0;
    private static int maxCnt = 0;
    private static String[] words;
    private static boolean[] alphabet = new boolean[26];
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        int size = Integer.parseInt(st.nextToken());
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int i=0; i<size; i++){
	            st = new StringTokenizer(br.readLine());
	            pq.offer(Integer.parseInt(st.nextToken()));
	        }
	        
	        while(!pq.isEmpty()){
	            System.out.println(pq.poll());
	        }
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}