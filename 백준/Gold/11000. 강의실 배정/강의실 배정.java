import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.PriorityQueue;
public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int N = Integer.parseInt(st.nextToken());	// 강의 수
    		
    		Lecture[] lecture = new Lecture[N];
    		for(int i=0; i<N; i++){
    		    st = new StringTokenizer(bf.readLine());
    		    lecture[i] = new Lecture(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    		}
    		//시작시간 기준으로 오름차순 정렬하고, 시간시간이 같을 시 종료시간으로 오름차순 정렬
    		Arrays.sort(lecture, (l1, l2) -> l1.start == l2.start ? l1.end - l2.end : l1.start - l2.start);
    		
    		PriorityQueue<Integer> pq = new PriorityQueue<>();
    		pq.offer(lecture[0].end);
    		
    		for(int i=1; i<N; i++){
    		    if(pq.peek() <= lecture[i].start){
    		        pq.poll();
    		    }
    		    pq.offer(lecture[i].end);
    		}
    		System.out.println(pq.size());
    	
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}
//강의실 시간,종료 객체
class Lecture {
    int start;
    int end;

    Lecture(int start, int end) {
        this.start = start;
        this.end = end;
    }
}