import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        // System.out.println(str);
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            answer += Integer.parseInt(Character.toString(ch));
        }

        return answer;
    }
}