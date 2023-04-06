class Solution {
    public static int xm = 0;
    public static int yn = 0;
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        xm = m;
        yn = n;
        for (int i = 0; i < balls.length; i++) {
            int[] target = balls[i];
            
            int targetX = target[0];
            int targetY = target[1];
            
            int num1 = 0;
            int num2 = 0;
            if(startX == targetX){
                if(startY > targetY){
                    num1 = (int)Math.pow(((n-startY) + (n-targetY)),2);
                }else{
                    num1 = (int)Math.pow(((targetY) + (startY)),2);
                }
                //왼쪽 벽과 오른쪽벽으로 길이 계산하여 최소값
                num2 = Math.min(getResult("left",startX, startY, targetX, targetY),getResult("right",startX, startY, targetX, targetY));
                answer[i] = Math.min(num1, num2);
            }else if(startY == targetY){
                if(startX > targetX){
                    num1 = (int)Math.pow(((m-startX) + (m-targetX)),2);
                }else{
                    num1 = (int)Math.pow(((targetX) + (startX)),2);
                }
                //위쪽 벽과 아래쪽벽으로 길이 계산하여 최소값
                num2 = Math.min(getResult("up",startX, startY, targetX, targetY),getResult("down",startX, startY, targetX, targetY));
                answer[i] = Math.min(num1, num2);
            }else{
                //윗 벽과 아래벽, 왼쪽벽, 오른쪽벽으로 길이 계산하여 최소값
                int sero = Math.min(getResult("up",startX, startY, targetX, targetY),getResult("down",startX, startY, targetX, targetY));
                
                int garo = Math.min(getResult("left",startX, startY, targetX, targetY),getResult("right",startX, startY, targetX, targetY));
                
                answer[i] = Math.min(sero, garo);
            }
        }

        return answer;
    }
    
    public static int getResult(String type, int x, int y, int tx, int ty){
        int rx = 0;
        int ry = 0;
        if("up".equals(type)){
            rx = Math.abs(x-tx);
            ry = (yn - y) + (yn - ty);
        }else if("down".equals(type)){
            rx = Math.abs(x-tx);
            ry = y+ty;
        }else if("left".equals(type)){
            rx = x+tx;
            ry = Math.abs(y-ty);
        }else if("right".equals(type)){
            rx = (xm - x) + (xm-tx);
            ry = Math.abs(y-ty);
        }
        return (int)Math.pow(rx,2) + (int)Math.pow(ry,2);
    }
}