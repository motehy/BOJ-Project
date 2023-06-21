class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String alpabet_s = "abcdefghijklmnopqrstuvwxyz";
        String alpabet_d = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(" ".equals(Character.toString(ch))){
                answer += " ";
                continue;
            }
            if(alpabet_s.contains(Character.toString(ch))){
                int idx = alpabet_s.indexOf(Character.toString(ch));
                idx = idx+n;
                if(idx > 25){
                    idx = idx-26;
                }
                answer += Character.toString(alpabet_s.charAt(idx));
            }else{
                int idx = alpabet_d.indexOf(Character.toString(ch));
                idx = idx+n;
                if(idx > 25){
                    idx = idx-26;
                }
                answer += Character.toString(alpabet_d.charAt(idx));
            }
        }
        return answer;
    }
}