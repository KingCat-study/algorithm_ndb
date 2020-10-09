package search_algorithm;

import java.util.Scanner;

public class BeakJoon_2606 {

	static int[][] map;
	static boolean[] checked;
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); //컴퓨터의 수
		int m = kb.nextInt(); //네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수
		
		map = new int[n+1][n+1];
		checked = new boolean[n+1];
		
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			map[a][b] = map[b][a] = 1;
		}
		
		kb.close();
		dfs(1);
		System.out.println(cnt);
		
	}
	
	public static void dfs(int v) {
		if(checked[v]) {
			return;
		}
		
		checked[v] = true;
		
		for (int i = 0; i < map.length; i++) {
			if(map[v][i] == 1 && !checked[i]) {
				cnt++;
				dfs(i);
			}
		}
	}
}
