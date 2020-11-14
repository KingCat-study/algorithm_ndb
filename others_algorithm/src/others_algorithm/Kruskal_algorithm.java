package others_algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal_algorithm {

	public static void main(String[] args) {
		
		int n = 7;
		int m = 11;
		
		ArrayList<Edge> nodeList = new ArrayList<>();
		
		nodeList.add(new Edge(1,7,12));
		nodeList.add(new Edge(1,4,28));
		nodeList.add(new Edge(1,2,67));
		nodeList.add(new Edge(1,5,17));
		nodeList.add(new Edge(2,4,24));
		nodeList.add(new Edge(2,5,62));
		nodeList.add(new Edge(3,5,20));
		nodeList.add(new Edge(3,6,37));
		nodeList.add(new Edge(4,7,13));
		nodeList.add(new Edge(5,6,45));
		nodeList.add(new Edge(5,7,73));
		nodeList.add(new Edge(1,7,12));
		
		Collections.sort(nodeList);
		int[] parent = new int[n];
		
		for (int i = 0; i < n; i++) {
			parent[i] = i;//최초 정점 상태를 만듬
		}
		
		int sum = 0;
		
		for (int i = 0; i < m; i++) {
			//-1 을 해주는 이유는 node[0]의 값은 cnt 이고 이를 index 로 맞추기 위해.
			//사이클이 완성되지 않으면 거리 집계 후 그래프 연결
			if(!findParent(parent, nodeList.get(i).node[0] - 1, nodeList.get(i).node[1] - 1)) {
				sum = sum + nodeList.get(i).distance;
				unionParent(parent, nodeList.get(i).node[0] - 1, nodeList.get(i).node[1] - 1);
			}
		}
		
		System.out.println(sum);
	}
	
	public static int getParent(int[] parent, int x) {
		if(parent[x] == x) {
			return x;
		} else {
			return parent[x] = getParent(parent, parent[x]);
		}
	}
	
	public static void unionParent(int[] parent, int a, int b) {
		a = getParent(parent,a);
		b = getParent(parent,b);
		
		if(a < b) {
			parent[b] = a;
		} else {
			parent[a] = b;
		}
	}
	
	public static boolean findParent(int[] parent, int a, int b) {
		a = getParent(parent,a);
		b = getParent(parent,b);
		
		if(a == b) {
			return true;
		} else {
			return false;
		}
	}
}

class Edge implements Comparable<Edge> {
	
	int[] node = new int[2];
	int distance;
	
	public Edge(int a, int b, int distance) {
		this.node[0] = a;
		this.node[1] = b;
		this.distance = distance;
	}

	@Override
	public int compareTo(Edge o) {
		if(this.distance < o.distance) {
			return -1;
		} else if(this.distance == o.distance) {
			return 0;
		} else {
			return 1;
		}
	}
}
