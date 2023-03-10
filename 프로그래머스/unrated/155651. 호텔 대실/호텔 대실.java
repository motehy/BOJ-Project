import java.util.Collections;
import java.util.Arrays;
import java.util.PriorityQueue;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        Times[] times = new Times[book_time.length];
        for(int i=0; i<book_time.length; i++){
            int startTime = Integer.parseInt(book_time[i][0].replace(":",""));
            int endTime = Integer.parseInt(book_time[i][1].replace(":",""));
            
            if(Integer.parseInt(book_time[i][1].replace(":","").substring(2,4))== 50){
                endTime = Integer.parseInt(book_time[i][1].replace(":","").substring(0,2) + "00")+100;
            }else if(Integer.parseInt(book_time[i][1].replace(":","").substring(2,4))> 50){
                endTime = Integer.parseInt(book_time[i][1].replace(":","").substring(0,2) + "0" + book_time[i][1].replace(":","").substring(3))+100;
            }else{
                endTime += 10;
            }
            times[i] = new Times(startTime, endTime);
            
        }

        Arrays.sort(times, (l1, l2)-> l1.start == l2.start ? l1.end - l2.end : l1.start - l2.start);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(times[0].end);

        for(int i=1; i<book_time.length; i++){

            if(pq.peek() <= times[i].start){
                pq.poll();
            }
            pq.offer(times[i].end);
        }
        answer = pq.size();
        return answer;
    }
    
}

class Times {
    int start;
    int end;
    
    Times(int start, int end){
        this.start = start;
        this.end = end;
    }
}