package search_algorithm;

import java.util.Scanner;

public class BeakJoon_11724 {

	static int[][] map;
	static boolean[] checked;
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		map = new int[n+1][n+1];
		checked = new boolean[n+1];
		
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		kb.close();
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			if(!checked[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	public static void dfs(int v) {
		
		if(checked[v]) {
			return;
		}
		
		checked[v] = true;
		
		for (int i = 0; i < map.length; i++) {
			if(map[v][i] == 1 && !checked[i]) {
				dfs(i);
			}
		}
	}
	
}
