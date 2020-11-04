package stepbystep.ten;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2447 {

	static String[][] startArr;
	static int n = 0;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		
		kb.close();
		
		startArr = new String[n][n];
		
		for (int i = 0; i < n; i++) {
			Arrays.fill(startArr[i], " ");
		}
		
		star(0,0,n);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(startArr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void star(int x, int y,int size) {
		
		if(size == 1) {
			startArr[x][y] = "*";
//			printStar();
			return;
		}
		
		int val = size / 3;
//		System.out.println(x + " : " + y + " : " + size + " : " + val);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) {
					continue;
				} else {
					star(x+(val*i),y+(val*j),val);
				}
			}
		}
	}
	
	public static void printStar() {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(startArr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
