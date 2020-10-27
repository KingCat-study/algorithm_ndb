package stepbystep.eight;

import java.util.Scanner;

public class Main_2775 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int t = kb.nextInt();
		for (int i = 0; i < t; i++) {
			int k = kb.nextInt();
			int n = kb.nextInt();
			System.out.println(calcNum(k,n));
		}
		
		kb.close();
	}
	
	public static int calcNum(int k, int n) {
		if(n == 0) {
			return 0;
		} else if(k == 0) {
			return n;
		} else {
			return calcNum(k,n-1) + calcNum(k-1,n);
		}
	}
}
