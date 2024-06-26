import java.util.Arrays;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        int cnt = 0;
        Arrays.sort(weights);
        for(int i=0; i<weights.length-1; i++){
            if(i > 0 && weights[i] == weights[i-1]){
                cnt--;
                answer += cnt;
                continue;
            }
            
            cnt = 0;
            
            for(int j=i+1; j<weights.length; j++){
                if(weights[i] == weights[j]
                   || weights[i] * 4 == weights[j] * 3
                   || weights[i] * 3 == weights[j] * 2
                   || weights[i] * 2 == weights[j]){
                    cnt ++;
                }
            }
            answer += cnt;
        }
        
        return answer;
    }
}