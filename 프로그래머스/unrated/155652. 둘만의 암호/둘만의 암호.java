class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            for(int j=0; j < index; j++){
                int n = (int)c+1;
                c = addChar(n);
                while(skip.contains(String.valueOf(c))){
                    c = addChar(c+1);
                }
            }
            answer += String.valueOf(c);
            
        }
        return answer;
    }
    
    public static char addChar(int n){
        char ch = (char)n;
        ch = n >122 ? 'a' : ch;
        return ch;
    }
}