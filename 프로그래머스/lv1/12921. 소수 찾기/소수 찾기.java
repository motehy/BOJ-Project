class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] box = new int[n+2];
        System.out.println(box.length);
        for(int i=2; i<=n; i++){
            for(int j=2; j<=n; j++){
                if(i*j > n){
                    break;
                }
                box[i*j] = 1;
            }
        }
        
        for(int i=2; i<=n; i++){
            if(box[i] == 0) answer++;
        }
        return answer;
    }
}