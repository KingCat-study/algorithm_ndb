package stepbystep.ten;

import java.util.Scanner;

public class Main_11729 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int d = (int)Math.pow(2, n)-1;
		
		System.out.println(d);
		hanoi(n,1,2,3);
		System.out.println(sb);
	}
	
	/**
	 * 
	 * @param n : 원판 갯수
	 * @param start : 시작점
	 * @param path : 중간점
	 * @param to : 목적지
	 */
	public static void hanoi(int n, int start, int path, int to) {
		if(n == 1) {
			sb.append(start + " " +to + "\n");
			return;
		}
		
		hanoi(n-1, start, to, path);
		
		sb.append(start + " " +to + "\n");
		
		hanoi(n-1, path, start, to);
	}
}
