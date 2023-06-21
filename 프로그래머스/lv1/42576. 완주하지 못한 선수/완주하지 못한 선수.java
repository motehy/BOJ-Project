import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int x=0; x<participant.length; x++){
            if(x != completion.length){
               if(!participant[x].equals(completion[x])){
                    answer = participant[x];
                    return answer;
                } 
            }else{
                return participant[x];
            }
            
        }
        return answer;
    }
}