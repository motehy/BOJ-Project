import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main
{
    public static int[][] miro;
    public static boolean[][] visit;
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int X = Integer.parseInt(st.nextToken());
    		int Y = Integer.parseInt(st.nextToken());
    		
    		miro = new int[X][Y];
    		visit = new boolean[X][Y];
    		for(int i=0; i<X; i++){
    		    st = new StringTokenizer(bf.readLine());
    		    String str = st.nextToken();
    		    for(int j=0; j<str.length(); j++){
    		        miro[i][j] = Character.getNumericValue(str.charAt(j));
    		        visit[i][j] = false;
    		    }
    		}
    		
    		Queue<xyForm> q = new LinkedList<>();
    		q.offer(new xyForm(0,0));
    		visit[0][0] = true;
    		
    		int[] moveX = {1, 0, -1, 0};
    		int[] moveY = {0, 1, 0, -1};
    		while(!q.isEmpty()){
    		    xyForm fm = q.poll();
    		    
    		    int mx = fm.getX();
    		    int my = fm.getY();
    		    for(int i=0; i<4; i++){
    		        //행렬 (벽)을 벗어날 경우 패스
    		        if(mx + moveX[i] < 0 || mx + moveX[i] >= X || my + moveY[i] < 0 || my + moveY[i] >= Y){
    		            continue;
    		        }
    		        //길이 아니거나 방문한곳은 패스
    		        if(miro[mx+moveX[i]][my+moveY[i]] == 0 || visit[mx+moveX[i]][my+moveY[i]] == true){
    		            continue;
    		        }
    		        
    		        miro[mx+moveX[i]][my+moveY[i]] = miro[mx][my]+ 1;
    		        visit[mx+moveX[i]][my+moveY[i]] = true;
    		        
    		        q.offer(new xyForm(mx+moveX[i], my+moveY[i]));
    		    }
    		   
    		}
    		System.out.println(miro[X-1][Y-1]);
    	
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static class xyForm{
        int x;
        int y;
        
        public xyForm(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public int getX(){
            return x;
        }
        
        public int getY(){
            return y;
        }
        
        public void setX(int x){
            this.x = x;
        }
        
        public void setY(int y){
            this.y = y;
        }
    }
}