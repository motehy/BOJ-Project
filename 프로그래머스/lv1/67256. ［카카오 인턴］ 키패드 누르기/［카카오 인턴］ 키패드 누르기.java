import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        for(int x=0; x<numbers.length; x++){
            int num = numbers[x];
            if(num == 1 || num == 4 || num == 7){
                answer += "L";
                left = num;
            }else if(num == 3 || num == 6 || num == 9){
                answer += "R";
                right = num;
            }else{
                int reftnum = this.rtnnum(num, left);
                int rightnum = this.rtnnum(num, right);
                if(reftnum >rightnum){
                    answer += "R";
                    right = num;
                }else if(reftnum <rightnum){
                    answer += "L";
                    left = num;
                }else{
                    if("right".equals(hand)){
                        answer += "R";
                        right = num;
                    }else{
                        answer += "L";
                        left = num;
                    }
                }
            }
        }
        return answer;
    }
    
    public int rtnnum(int num, int handnum){
        int rtn = 0;
        
        if(num == 2){
            if(handnum == 1 || handnum == 3 || handnum == 5){
                rtn = 1;
            }else if(handnum == 4 || handnum == 6 || handnum == 8){
                rtn = 2;
            }else if(handnum == 7 || handnum == 9 || handnum == 11 || handnum == 0){
                rtn = 3;
            }else if(handnum == 10 || handnum == 12){
                rtn = 4;
            }
        }else if(num == 5){
            if(handnum == 2 || handnum == 4 || handnum == 6 || handnum == 8){
                rtn = 1;
            }else if(handnum == 1 || handnum == 3 || handnum == 7 || handnum == 9 || handnum == 0){
                rtn = 2;
            }else if(handnum == 10 || handnum == 12){
                rtn = 3;
            }
        }else if(num == 8){
            if(handnum == 5 || handnum == 7 || handnum == 9 || handnum == 0){
                rtn = 1;
            }else if(handnum == 2 ||handnum == 4 || handnum == 6 || handnum == 10 || handnum == 12){
                rtn = 2;
            }else if(handnum == 1 || handnum == 3){
                rtn = 3;
            }
        }else if(num == 0){
            if(handnum == 8 || handnum == 10 || handnum == 12){
                rtn = 1;
            }else if(handnum == 5 ||handnum == 7 || handnum == 9){
                rtn = 2;
            }else if(handnum == 2 || handnum == 4 || handnum == 6){
                rtn = 3;
            }else if(handnum == 1|| handnum == 3){
                rtn = 4;
            }
        }
        return rtn;
    }
}