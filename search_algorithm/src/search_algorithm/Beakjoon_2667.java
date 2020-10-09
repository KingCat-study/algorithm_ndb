package search_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Beakjoon_2667 {

	static int[] directRow = {1,-1,0,0};
	static int[] directCol = {0,0,-1,1};
	static ArrayList<Integer> areaCntList = new ArrayList<>();
	static int[][] map;
	static int areaCnt = 0;
	static int row;
	static boolean[][] checked;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		row = Integer.parseInt(st.nextToken());
		
		map = new int[row][row];
		checked = new boolean[row][row];
		
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < row; j++) {
				map[i][j] = line.charAt(j)-'0';
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(map[i][j] == 1 && !checked[i][j]) {
					areaCnt = areaCnt+ 1;
					areaCntList.add(areaCnt-1,0);
					bfs(i,j);
				}
			}
		}
		
		Collections.sort(areaCntList);
		
		System.out.println(areaCnt);
		for (int i = 0; i < areaCntList.size(); i++) {
			System.out.println(areaCntList.get(i));
		}
	}
	
	public static void bfs(int i, int j) {
		
		Queue<int[]> q = new LinkedList<>();

		q.add(new int[] {i,j});
		checked[i][j] = true;
//		areaCntList[areaCnt]++;
		int v = areaCntList.get(areaCnt-1);
		areaCntList.set(areaCnt-1, v+1);
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			
			for (int t = 0; t < 4; t++) {
				int r = cur[0] + directRow[t];
				int c = cur[1] + directCol[t];
				
				if(r >= 0 && c >= 0 && r < row && c < row) {
					if(map[r][c] != 0 && !checked[r][c]) {
						q.add(new int[] {r,c});
						checked[r][c] = true;
//						areaCntList[areaCnt]++;
						areaCntList.set(areaCnt-1, areaCntList.get(areaCnt-1)+1);
					}
				}
			}
		}
	}
}
