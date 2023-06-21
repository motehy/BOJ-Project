class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long amt = 0;
        for(int i=1; i<=count; i++){
            amt += ((long)price * i);
        }

        return (amt > money) ? (amt - money) : 0;
    }
}