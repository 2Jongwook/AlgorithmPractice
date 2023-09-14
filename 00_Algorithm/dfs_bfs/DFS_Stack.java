package dfs_bfs;

import java.util.Deque;
import java.util.LinkedList;

public class DFS_Stack {

	public static void main(String[] args) {
		int[][] graph = {{},
				{2, 3, 8},
				{1, 7},
				{1, 4, 5},
				{3, 5},
				{3, 4},
				{7},
				{2, 6, 8},
				{1, 7}};
		
		boolean[] visited = {false, false, false, false, false, false, false, false, false};
		
		DFS_Stack dfsEx = new DFS_Stack();
		dfsEx.dfs(graph, 1, visited);
	}
	
	void dfs(int[][] graph, int start, boolean[] visited) {
		visited[start] = true;
		System.out.print(start + " ");
		
		Deque<Integer> stack = new LinkedList<>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			int now = stack.peek();
			
			boolean hasNear = false;
			
			for(int i : graph[now]) {
				if(!visited[i]) {
					hasNear = true;
					stack.push(i);
					visited[i] = true;
					System.out.print(i + " ");
					break;
				}
			}
			
			if(hasNear == false)
				stack.pop();
		}
	}

}
