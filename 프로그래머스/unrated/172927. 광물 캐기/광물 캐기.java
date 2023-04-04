import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int maxLen = (picks[0] + picks[1] + picks[2]) * 5;
        int arrLen = minerals.length > maxLen ? (picks[0] + picks[1] + picks[2]) : minerals.length/5+1;
        
        int[][] mArr = new int[arrLen][3];
        for(int i=0; i<minerals.length; i++){
            int idx = i / 5;
            if(i < maxLen){
                if("diamond".equals(minerals[i])){
                    mArr[idx][0] += 1;
                    mArr[idx][1] += 5;
                    mArr[idx][2] += 25;
                }else if("iron".equals(minerals[i])){
                    mArr[idx][0] += 1;
                    mArr[idx][1] += 1;
                    mArr[idx][2] += 5;
                }else if("stone".equals(minerals[i])){
                    mArr[idx][0] += 1;
                    mArr[idx][1] += 1;
                    mArr[idx][2] += 1;
                }
            }
        }
        Arrays.sort(mArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[2] < o2[2]) 
                    return 1;
                else 
                    return -1;
            }
        });
        
        for(int i=0; i<mArr.length;i++){
            if(picks[0]> 0){
                answer += mArr[i][0];
                picks[0] -=1;
            }else if(picks[1]> 0){
                answer += mArr[i][1];
                picks[1] -=1;
            }else if(picks[2]> 0){
                answer += mArr[i][2];
                picks[2] -=1;
            }
        }
        return answer;
    }
}