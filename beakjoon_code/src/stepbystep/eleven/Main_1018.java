package stepbystep.eleven;

import java.util.Scanner;

public class Main_1018 {

	static char[][] chess;
	static int min = 64;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		chess = new char[n][m];
		
		kb.nextLine();
		
		for (int i = 0; i < n; i++) {
			String lineStr = kb.nextLine().trim();
			for (int j = 0; j < m; j++) {
				chess[i][j] = lineStr.charAt(j);
			}
		}
		
		kb.close();
		
		int startN = n - 7;
		int startM = m - 7;
		
		for (int i = 0; i < startN; i++) {
			for (int j = 0; j < startM; j++) {
				findColor(i,j);
			}
		}
		
		System.out.println(min);
	}
	
	public static void findColor(int n, int m) {
		int endN = n + 8;
		int endM = m + 8;
		int count = 0;
		
		char startColor = chess[n][m];
		
		for (int i = n; i < endN; i++) {
			for (int j = m; j < endM; j++) {
				if(chess[i][j] != startColor) {
					count++;
				} 
				
				////다음 칸으로 넘어 갈 때도 시작 색과 반대이므로
				startColor = startColor == 'W' ? 'B':'W';
			}
			
			//다음 줄로 넘어 갈 때도 시작 색과 반대이므로
			startColor = startColor == 'W' ? 'B':'W';
		}
		
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
	}
}
