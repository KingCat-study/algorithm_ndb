package search_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BeakJoon_1012 {

	
	static int map[][];
	static boolean[][] checked;
	static int[] dr = {1,-1,0,0};
	static int[] dc = {0,0,-1,1};
	static int m = 0;
	static int n = 0;
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int t = kb.nextInt(); // 테스트 케이스 개수
		ArrayList<Integer> areaCnt = new ArrayList<>();
		
		for (int i = 0; i < t; i++) {
			int cnt = 0;
			m = kb.nextInt(); //배추밭의 가로 길이
			n = kb.nextInt(); //배추밭의 세로 길이
			int k = kb.nextInt(); //배추가 심어져 있는 위치의 개수
			
			map = new int[m][n];
			checked = new boolean[m][n];
			
			for (int j = 0; j < k; j++) {
				int x = kb.nextInt();
				int y = kb.nextInt();
				
				map[x][y] = 1;
			}
			
			for (int j = 0; j < m; j++) {
				for (int h = 0; h < n; h++) {
					if(map[j][h] == 1 && !checked[j][h]) {
						cnt++;
//						bfs(j,h);
						dfs(j,h);
					}
				}
			}
			areaCnt.add(cnt);
		}
		
		for(int p : areaCnt) {
			System.out.println(p);
		}
		
		kb.close();
	}
	
	public static void bfs(int i,int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		checked[i][j] = true;
		
		while(!q.isEmpty()) {
			int [] coord = q.poll();
			int x = coord[0];
			int y = coord[1];
			
			for (int k = 0; k < dr.length; k++) {
				int r = y + dr[k];
				int c = x + dc[k];
				
				if(r >= 0 && c >= 0 && r < n && c < m) {
					if(map[c][r] == 1 && !checked[c][r]) {
						checked[c][r] = true;
						q.add(new int[] {c,r});
					}
				}
			}
		}
	}
	
	public static void dfs(int i,int j) {
		if(checked[i][j]) {
			return;
		}
		
		checked[i][j] = true;
		
		for (int k = 0; k < dr.length; k++) {
			int r = j + dr[k];
			int c = i + dc[k];
			
			if(r >= 0 && c >= 0 && r < n && c < m) {
				if(map[c][r] == 1 && !checked[c][r]) {
					dfs(c,r);
				}
			}
		}
	}
}
