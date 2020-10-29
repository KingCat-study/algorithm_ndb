package stepbystep.nine;

import java.util.Scanner;

public class Main_9020 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int n = kb.nextInt();
			int min = 10001;
			for (int p = 2; p < n; p++) {
				int j = 0;
				int k = 0;
				
				if(isPrime(p)) {
					j = n - p;
					
					if(isPrime(j)) {
						k = n - j;
					}
					
					int l = Math.abs(j-k);
					
					if(j <= k && min > l) {
						min = l;
						System.out.println(j + " " + k);
					}
				}
			}
		}
		
		kb.close();
	}
	
	public static boolean isPrime(int a) {
		boolean isPrime = true;
		
		if(a <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i*i <= a && isPrime; i++) {
				if(a % i == 0) {
					isPrime = false;
				}
			}
		}
		
		return isPrime;
	}
}
