class Solution {
    public String solution(String s) {
        String answer = "";
        int mlen = s.length()/2;
        if(s.length() % 2 == 0){
            answer = s.charAt(mlen-1) +""+ s.charAt(mlen);
        }else{
            answer = s.charAt(mlen)+"";
        }
        return answer;
    }
}