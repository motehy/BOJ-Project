import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;
public class Main
{
    public static final int Max = 100000;
    public static boolean[] visited = new boolean[Max + 1];
	public static Queue<Node> q = new LinkedList<Node>();
	public static int minCost = Integer.MAX_VALUE;
	public static int N = 0;
	public static int K = 0;
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		//수빈이의 위치
    		N = Integer.parseInt(st.nextToken());
    		
    		//동생의 위치
    		K = Integer.parseInt(st.nextToken());
    		
            //수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동
    		
    		//최소 횟 수 구하기
    		solution();
    		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void solution(){
	    q.offer(new Node(N, 0));
	    visited[N] = true;
	    while(!q.isEmpty()){
	        Node nd = q.poll();
	        if(nd.value == K){
	           minCost = Math.min(minCost, nd.cost);
	        }
	        int nextV = nd.value + 1;
	        if(nextV <= Max && !visited[nextV]){
	            visited[nextV] = true;
	            q.offer(new Node(nextV, nd.cost+1));
	        }
	        nextV = nd.value - 1;
	        if(nextV >= 0 && !visited[nextV]){
	            visited[nextV] = true;
	            q.offer(new Node(nextV, nd.cost+1));
	        }
	        nextV = nd.value * 2;
	        if(nextV <= Max && !visited[nextV]){
	            visited[nextV] = true;
	            q.offer(new Node(nextV, nd.cost+1));
	        }
	    }
	    System.out.println(minCost);
	}
}

class Node{
    int value;
    int cost;
    public Node(int value, int cost){
        this.value = value;
        this.cost = cost;
    }
}
