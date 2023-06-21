import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        int resultArrSize = 0;  //실제 result 배열의 크기
        Map<String, String> map = new HashMap<>();
        for(int i=0; i< record.length; i++){
            String[] txt = record[i].split(" ");
            //Set on the map only for "Enter" or "Change"
            if(txt.length >2 && (txt[0].equals("Enter") || txt[0].equals("Change"))){
                map.put(txt[1],txt[2]);
            }
            //result array is "Enter" or "Leave" => add result array size
            if(txt[0].equals("Enter") || txt[0].equals("Leave")){
                resultArrSize++;
            }
        }
        answer = new String[resultArrSize];
        int num = 0;    //answer index
        for(int i=0; i< record.length; i++){
            String[] txt = record[i].split(" ");
            //txt length > 2 : action => "Enter" or "Change"
            if(txt.length >2){
                if(txt[0].equals("Enter")){
                    answer[num] = map.get(txt[1])+"님이 들어왔습니다.";
                    num++;
                }
            }else{
                //action => "Leave"
                if(txt[0].equals("Leave")){
                    answer[num] = map.get(txt[1])+"님이 나갔습니다.";
                    num++;
                }
            }
            
        }
        
        return answer;
    }
}