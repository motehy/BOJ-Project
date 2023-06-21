class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int x = 1; x<10; x++){
           answer += x;
        }
        
        for(int num:numbers){
            
            for(int x = 1; x<10; x++){
                if(num == x){
                    answer -= num;
                }
            }
        }
        return answer;
    }
}