import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int idx = 1;
        List<Integer> list = new ArrayList<>();
        for(int i = left; i<= right; i++){
            idx = 1;
            list = new ArrayList<>();
            while(idx<=i){
                if(i%idx == 0){
                    list.add(i);
                }
                idx++;
            }
            if(list.size()%2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
}