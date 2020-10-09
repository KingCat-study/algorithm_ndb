package search_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BeakJoon_1260 {
	
	static int map[][];
	static boolean checked[];
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); //정점의 개수
		int m = kb.nextInt(); //간선의 개수
		int v = kb.nextInt(); //시작할 정점의 번호
		
		// 간선의 갯수는 정점보다 1 많으므로 n+1
		map = new int[n+1][n+1]; 
		checked = new boolean[n+1];
		
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		kb.close();
		dfs(v);
		checked = new boolean[n+1];
		System.out.println();
		bfs(v);
	}
	
	public static void dfs(int v) {
		checked[v] = true;
		System.out.print(v + " ");
		
		for (int i = 0; i < map.length; i++) {
			if(map[v][i] == 1 && !checked[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		checked[v] = true;
		q.add(v);
		
		while(!q.isEmpty()) {
			int a = q.poll();
			
			System.out.print(a + " ");
			
			for (int i = 0; i < map.length; i++) {
				if(map[a][i] == 1 && !checked[i]) {
					checked[i] = true;
					q.add(i);
				}
			}
		}
	}
}
