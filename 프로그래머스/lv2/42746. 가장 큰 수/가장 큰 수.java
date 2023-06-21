import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for(int number : numbers){
            list.add(String.valueOf(number));
        }
        Collections.sort(list, (a,b) -> (b+a).compareTo(a+b));
        for(String str : list){
            answer += str;
        }
        if(answer.startsWith("0")){
            answer = "0";
        }
        return answer;
    }
}