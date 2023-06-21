import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int n = 0;
        int[] score = new int[3];
        int idx = 0, numIdx = 0;
        for ( int i= 0; i < dartResult.length(); i++){
            char str = dartResult.charAt(i);
            
            if(Character.isDigit(str)){
               n = 0;
               if(str == '1' && dartResult.charAt(i + 1) == '0'){
                    n = 10;
                    i++;
                }else {
                    n = Character.getNumericValue(str);
                } 
                numIdx++;
            }else{
                switch(str){
                    case 'S':
                        score[idx] = (int)Math.pow(n,1);
                        idx ++;
                        System.out.println(score);
                        break;
                    case 'D':
                        score[idx] = (int)Math.pow(n,2);
                        idx ++;
                        System.out.println(score);
                        break;
                    case 'T':
                        score[idx] = (int)Math.pow(n,3);
                        idx ++;
                        System.out.println(score);
                        break;
                    case '*':
                        int sx = numIdx -2 < 0 ? 0 : numIdx -2;
                        for (int x = sx; x<numIdx; x++){
                            score[x] = score[x] * 2;
                        }
                        break;
                    case '#':
                        score[idx-1] = score[idx-1] * (-1);
                        break;
                }
            }
            
        }
        for (int i : score) {
            answer += i;
        }
        
        return answer;
    }
    
    
}