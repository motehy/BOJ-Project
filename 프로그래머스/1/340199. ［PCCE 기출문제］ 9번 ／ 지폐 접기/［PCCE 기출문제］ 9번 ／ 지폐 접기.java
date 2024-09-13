class Solution {
    public static int count = 0;
    public int solution(int[] wallet, int[] bill) {
        putWallet(wallet, bill);
        return count;
    }
    
    public static void putWallet(int[] wallet, int[] bill){
        //1. 지갑에 들어가는 경우
        while((wallet[0] < bill[0] || wallet[1] < bill[1]) && (wallet[0] < bill[1] || wallet[1] < bill[0])){
            if(bill[0] >= bill[1]){
                bill[0] = bill[0] / 2;
            }else{
                bill[1] = bill[1] / 2;
            }
            count ++;
        }
    }
}