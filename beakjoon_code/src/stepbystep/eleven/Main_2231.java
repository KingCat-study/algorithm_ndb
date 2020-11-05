package stepbystep.eleven;

import java.util.Scanner;

public class Main_2231 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		kb.close();

		int ans = 0;
		
		for (int i = 1; i <= n; i++) {
			int cSum = charSum(i);
			if(i + cSum == n) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
	}
	
	public static int charSum(int n) {
		int sum = 0;
		
		String s = String.valueOf(n);
		
		for (int j = 0; j < s.length(); j++) {
			int c = s.charAt(j) - '0';
			sum = sum + c;
		}
		return sum;
	}
}
