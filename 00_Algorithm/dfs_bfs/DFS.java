package dfs_bfs;

public class DFS {

	public static boolean[] visited = {false, false, false, false, false, false, false, false, false};
	
	public static int[][] graph = {{},
			{2, 3, 8},
			{1, 7},
			{1, 4, 5},
			{3, 5},
			{3, 4},
			{7},
			{2, 6, 8},
			{1, 7}};
	
	public static void main(String[] args) {
		int start = 1;
		dfs(start);
	}
	
	public static void dfs(int v) {
		visited[v] = true;
		System.out.print(v + " ");
		
		for(int i : graph[v]) {
			if(visited[i] == false) {
				dfs(i);
			}
		}
	}

}
