import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
 
public class Main {
    public static boolean[] visit;
    public static Queue<Integer> q;
    public static int[][] boxs;
    public static int N;
    public static int M;
    public static int V;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();   //정점의 개 수
        M = sc.nextInt();   //간선의 개 수
        V = sc.nextInt();   //시작할 정점의 번호
        
        visit = new boolean[1001];
        boxs = new int[1001][1001];
        
        for(int i=0; i<M; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            
            boxs[n1][n2] = 1;
            boxs[n2][n1] = 1;
            
        }
        Dfs(V);
        
        Arrays.fill(visit, false);
        System.out.println();
        Bfs(V);
        
    }
    
    public static void Dfs(int start){
        visit[start] = true;
        System.out.print(start + " ");
        for(int i=1; i<=N; i++){
            if(boxs[start][i] == 1 && visit[i] == false){
                Dfs(i);
            }
        } 
    }
    
    public static void Bfs(int start){
        q = new LinkedList<Integer>();
        q.add(start);
        visit[start] = true;
        System.out.print(start + " ");
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i=1; i<boxs.length; i++){
                if(boxs[temp][i] == 1 && visit[i] == false){
                    System.out.print(i + " ");
                    visit[i] = true;
                    q.add(i);
                }
            }
        } 
    }
 
}