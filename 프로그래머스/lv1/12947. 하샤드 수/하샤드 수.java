class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int num = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            num += Integer.parseInt(Character.toString(ch));
        }
        if(x % num == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}