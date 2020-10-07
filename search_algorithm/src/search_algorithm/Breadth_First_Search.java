package search_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Breadth_First_Search {

	static boolean[] checked = new boolean[5];
	static ArrayList<int[]> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//각 노드별로 인접한 노트를 연결한다.
		list.add(0, new int[] {1,2,3});
		list.add(1, new int[] {0,2});
		list.add(2, new int[] {0,1,3,4});
		list.add(3, new int[] {2,4});
		list.add(4, new int[] {0,2,3});
		
		bfs(0);
	}
	
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		checked[start] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			
			System.out.println(x);
			
			for (int i = 0; i < list.get(x).length; i++) {
				int y = list.get(x)[i];
				if(!checked[y]) {
					q.add(y);
					checked[y] = true;
				}
			}
		}
	}
}
