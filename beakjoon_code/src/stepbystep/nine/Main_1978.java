package stepbystep.nine;

import java.util.Scanner;

public class Main_1978 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int k = kb.nextInt();
			
			boolean isPrime = true;
			
			if(k <= 1) {
				isPrime = false;
			} else {
				for (int j = 2; j*j <= k && isPrime; j++) {
					if(k % j == 0) {
						isPrime = false;
					}
				}
			}
			
			if(isPrime) {
				cnt++;
			}
		}
		
		kb.close();
		System.out.println(cnt);
	}
}
