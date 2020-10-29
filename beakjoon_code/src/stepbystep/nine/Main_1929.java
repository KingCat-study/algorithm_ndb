package stepbystep.nine;

import java.util.Scanner;

public class Main_1929 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int m = kb.nextInt();
		int n = kb.nextInt();
		
		kb.close();
		
		
		for (int i = m; i <= n; i++) { 
			boolean isPrime = true;
			
			if(i == 1) {
				isPrime = false;
			} else {
				for (int j = 2; j*j <= i && isPrime; j++) {
					if(i % j == 0) {
						isPrime = false;
					}
				}
			}
			
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
