package search_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Beakjoon_2178 {
	
	static int[][] map;
	static int row;
	static int col;
	static boolean[][] visited;
	static int[] dr = {1,-1,0,0};
    static int[] dc = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		
		map = new int[row][col];
		visited = new boolean[row][col];
		
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < col; j++) {
				map[i][j] = map[i][j] = line.charAt(j) - '0';
			}
		}
		bfs();
	}
	
	public static void bfs() {
		
		Queue<int[]> q = new LinkedList<>();
		int i = 0;
		int j = 0;
		q.offer(new int[] {i,j});
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			visited[i][j] = true;
			
			for (int dir = 0; dir < 4; dir++) {
				int r = cur[0] + dr[dir];
				int c = cur[1] + dc[dir];
				
				if(r >= 0 && c >= 0 && r < row && c < col) {
					if(map[r][c] != 0 && !visited[r][c]) {
						q.offer(new int[] {r,c});
						visited[r][c] = true;
						map[r][c] = map[cur[0]][cur[1]]+1;
					}
				}
			}
			
		}
		
		System.out.println(map[row-1][col-1]);
	}
}
