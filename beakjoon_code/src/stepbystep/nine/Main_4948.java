package stepbystep.nine;

import java.util.Scanner;

public class Main_4948 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			
			int n = kb.nextInt();
			
			if(n == 0) {
				break;
			}
			
			int n2 = n * 2;
			int cnt = 0;
			
			for (int i = n+1; i <= n2; i++) {
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
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
		kb.close();
	}
}
