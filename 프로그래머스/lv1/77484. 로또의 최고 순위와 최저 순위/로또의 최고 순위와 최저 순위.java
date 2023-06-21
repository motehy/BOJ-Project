import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxnum = 0;
        int zeronum = 0;
        int maxrank = 0;
        int minrank = 0;
        
        
        
    
        
        for(int x=0; x< lottos.length; x++){
            if(lottos[x] == 0){
                zeronum +=1;
            }
           for(int y=0; y<win_nums.length; y++){
               if(lottos[x] == win_nums[y]){
                   maxnum +=1;
               }
           } 
        }
        switch(maxnum){
            case 1:
                minrank = 6;
                break;
            case 2:
                minrank = 5;
                break;
            case 3:
                minrank = 4;
                break;
            case 4:
                minrank = 3;
                break;
            case 5:
                minrank = 2;
                break;
            case 6:
                minrank = 1;
                break;
            default:
                minrank = 6;
        }
        switch(maxnum+zeronum){
            case 1:
                maxrank = 6;
                break;
            case 2:
                maxrank = 5;
                break;
            case 3:
                maxrank = 4;
                break;
            case 4:
                maxrank = 3;
                break;
            case 5:
                maxrank = 2;
                break;
            case 6:
                maxrank = 1;
                break;
            default:
                maxrank = 6;
        }
        answer[0] = (maxrank);
        answer[1] = (minrank);
        
        return answer;
    }
}