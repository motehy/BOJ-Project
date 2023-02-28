import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
 
public class Main {
    public static int[][] target;
    public static boolean[] visit;
    public static int comp = 0;
    public static int count = 0;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        comp = sc.nextInt(); // 컴퓨터 수
        int sn = sc.nextInt();   //컴퓨터 연결 된 쌍의 수
        
        target = new int[101][101];
        visit = new boolean[101];
        
        for(int i=1; i<=sn; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            target[a][b] = 1;
            target[b][a] = 1;
        }
        
        int startComp = 1;
        Dfs(startComp);
        
        System.out.println(count);
    }
    
    public static void Dfs(int start){
        visit[start] = true;
        for(int i=1; i<=comp; i++){
            if(target[start][i] == 1 && visit[i] == false){
                count ++;
                Dfs(i);
            }
        }
    }
}