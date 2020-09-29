package search_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(7);
		q.add(5);
		q.add(4);
		q.poll();
		q.add(6);
		q.poll();
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
