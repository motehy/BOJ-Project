import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
    public static int[][] earth = null;
    public static boolean[][] visit = null;
    public static int[] rx = {-1, 1, 0, 0};
    public static int[] ry = {0, 0, -1, 1};
    public static int M = 0;
    public static int N = 0;
	public static void main(String[] args) {
	    try{
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		StringBuilder sb = new StringBuilder();
            int _case = Integer.parseInt(br.readLine());
            for(int i=0; i<_case; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                
                //첫째 줄 :배추를 심은 배추밭의 가로길이 M(1 ≤ M ≤ 50)
                //둘째 줄 :배추를 심은 배추밭의 세로길이 N(1 ≤ N ≤ 50)
                //셋째 줄 :배추가 심어져 있는 위치의 개수 K(1 ≤ K ≤ 2500)
                M = Integer.parseInt(st.nextToken());
                N = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());
                earth = new int[M+1][N+1];
                visit = new boolean[M+1][N+1];
                for(int j=0; j<K; j++){
                    // 배추의 위치 X(0 ≤ X ≤ M-1), Y(0 ≤ Y ≤ N-1)가 주어진다.
                    st = new StringTokenizer(br.readLine());
                    int X = Integer.parseInt(st.nextToken());
                    int Y = Integer.parseInt(st.nextToken());
                    
                    earth[X][Y] = 1;
                }
                
                int cnt = 0;
                for(int x=0; x<earth.length; x++){
                    for(int y=0; y<earth[0].length; y++){
                        if(earth[x][y] > 0 && !visit[x][y]){
                            solution(x, y);
                            cnt++;
                        }
                    }
                }
                sb.append(cnt)
                  .append("\n");
                
            }
            System.out.println(sb);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void solution(int x, int y){
        visit[x][y] = true;
        for(int i=0; i<4; i++){
            if(x+rx[i] < 0 || y+ry[i] < 0 || x+rx[i] >= M || y+ry[i] >= N){
                continue;
            }
            if(!visit[x+rx[i]][y+ry[i]] && earth[x+rx[i]][y+ry[i]] > 0){
                solution(x+rx[i], y+ry[i]);
            }
        }
	}
}