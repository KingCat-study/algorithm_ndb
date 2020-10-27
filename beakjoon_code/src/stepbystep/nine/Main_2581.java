package stepbystep.nine;

import java.util.Scanner;

public class Main_2581 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int m = kb.nextInt();
		int n = kb.nextInt();
		int cnt = 0;
		int sum = 0;
		int min = 10000;
		kb.close();
		
		for(int i = m; i <= n; i++) {
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
				sum = sum + i;
				if(min > i) {
					min = i;
				}
			}
		}
		
		if(cnt == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
