import java.util.ArrayList;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int ps = p.length()-1;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<t.length()-ps; i++){
            StringBuilder sb = new StringBuilder();
            sb= new StringBuilder(String.valueOf(t.charAt(i)));
            
            for(int j=1; j<=ps; j++){
                sb.append(String.valueOf(t.charAt(i+j)));
            }
            list.add(sb.toString());
        }
        for(int i=0; i<list.size(); i++){
            long ip = Long.parseLong(p);
            long it = Long.parseLong(list.get(i));
            if(it<=ip){
                answer++;
            }
        }
        return answer;
    }
}