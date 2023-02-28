import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
    public static boolean[][] visit;
    public static int[][] state;
    public static int N;
    public static int[] moveX = {0, -1, 1, 0, 0};
    public static int[] moveY = {0, 0, 0, -1, 1};
    public static int count = 0;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.nextLine());
		
		visit = new boolean[N+1][N+1];
		state = new int[N+1][N+1];
		
		//state : 0110100
	    //        0110101....
		for(int i=1; i<=N; i++){
		    String str = sc.nextLine();
		    
		    for(int j=0; j<str.length(); j++){
		        char ch = str.charAt(j);
		        if("1".equals(String.valueOf(ch))){
		            state[i][j+1] = 1;
		        }
		    }
		}
		
		//실행
		int kind =0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<state.length; i++){
		    for(int j=1; j<state[i].length; j++){
		        if(visit[i][j] == false && state[i][j] == 1){
		            kind ++;
		            
		            count = 0;
		            Dfs(i,j);
		            list.add(count);
		        }
		    }
		}
		
		System.out.println(kind);
		Collections.sort(list);
		for(int n : list){
		    System.out.println(n);
		}
	}
	public static void Dfs(int x, int y){
	    for(int i =0; i<5; i++){
	        int move_X = moveX[i];
	        int move_Y = moveY[i];
	        move_X = x+move_X > N ? 0 : (x+move_X == 0 ? 0 : move_X);
	        move_Y = y+move_Y > N ? 0 : (y+move_Y == 0 ? 0 : move_Y);
	        if(visit[x+move_X][y+move_Y] == false && state[x+move_X][y+move_Y] == 1){
	            visit[x+move_X][y+move_Y] = true;
	            ++count;
                Dfs(x+move_X, y+move_Y);
            }
	    }
	}
}
