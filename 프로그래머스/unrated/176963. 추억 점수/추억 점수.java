import java.util.Arrays;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            String[] strs = photo[i];
            int sum = 0;
            for(int j=0; j<strs.length; j++){
                int yearningIdx = Arrays.asList(name).indexOf(strs[j]);
                if(yearningIdx > -1){
                    sum += yearning[yearningIdx];
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}