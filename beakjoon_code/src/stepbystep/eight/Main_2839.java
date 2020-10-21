package stepbystep.eight;

import java.util.Scanner;

public class Main_2839 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		
		kb.close();
		
		int cnt = 0;
		
		while(true) {
			if(a % 5 == 0) {
				System.out.println(a/5 + cnt);
				break;
			} else if(a <= 0) {
				System.out.println(-1);
				break;
			}
			a = a - 3;
			cnt++;
		}
	}
}
