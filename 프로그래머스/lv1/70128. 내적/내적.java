class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int sum = 0;
        for(int x= 0; x<a.length; x++){
            sum += a[x]*b[x];
        }
        return sum;
    }
}