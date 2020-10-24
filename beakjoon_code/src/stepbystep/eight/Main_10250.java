package stepbystep.eight;

import java.util.Scanner;

public class Main_10250 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int t = kb.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int h = kb.nextInt();
			int w = kb.nextInt();
			int n = kb.nextInt();
			
			int floor = 0;
			int num = 0;
			
			if(n % h == 0) {
				floor = h*100;
				num = n/h;
			} else {
				floor = (n % h) * 100;
				num = (n/h)+1;
			}
			
			System.out.println(floor+num);
		}
		
		kb.close();
	}
}
