import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = this.exchangeStr(s);
        answer = Integer.parseInt(str);
        return answer;
    }
    
    public  String exchangeStr(String str){
        //String  = 0;
        str = str.replace("zero","0");
        str = str.replace("one","1");
        str = str.replace("two","2");
        str = str.replace("three","3");
        str = str.replace("four","4");
        str = str.replace("five","5");
        str = str.replace("six","6");
        str = str.replace("seven","7");
        str = str.replace("eight","8");
        str = str.replace("nine","9");

        return str;
    }
}