class Solution {
    public int solution(int num) {
        long lnum = (long)num;
        int answer = 0;
        if(lnum == 1){
            answer = 0;
        }else{
            for(int i=0; i<500; i++){
                if(lnum % 2 == 0){
                    //짝수
                    lnum = lnum / 2;
                    answer ++;
                }else{
                    //홀수
                    lnum = lnum * 3 + 1;
                    answer ++;
                }
                if(lnum == 1){
                    break;
                }
            }
            System.out.println(lnum);
            if(lnum != 1){
                answer = -1;
            }
        }
        
        return answer;
    }
}