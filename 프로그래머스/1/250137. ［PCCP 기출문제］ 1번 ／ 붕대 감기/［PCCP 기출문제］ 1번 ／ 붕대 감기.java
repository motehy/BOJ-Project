class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int lasttime = attacks[attacks.length-1][0];
        int heal = bandage[1];  // 체력 회복량
        int healSuccessCnt = 0; //연속 성공
        
        //몬스터 마지막 공격 까지 반복
        for(int i=1; i<=lasttime; i++){
            boolean ctn = true;
            //몬스터 공격 만큼 반복
            for(int x=0; x<attacks.length; x++){
                //몬스터 공격 시간과 현재 시간이 일치할때
                if(attacks[x][0] == i){
                    int damage = attacks[x][1];
                    answer -= damage;
                    healSuccessCnt = 0;
                    ctn = false;
                    break;
                }
            }
            if(ctn){
                answer += heal;
                ++healSuccessCnt;
                if(healSuccessCnt == bandage[0]){
                    answer += bandage[2];
                    healSuccessCnt = 0;
                }
                if(health < answer){
                    answer = health;
                } 
            }
            if(answer <= 0){
                answer = -1;
                break;
            }
            
        }
        return answer;
    }
}