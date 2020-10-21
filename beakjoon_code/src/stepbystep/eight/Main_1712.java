package stepbystep.eight;

import java.util.Scanner;

public class Main_1712 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		kb.close();
		
		if(c <= b) {
			System.out.println(-1);
		} else {
			System.out.println(a/(c-b)+1);
		}
	}
}
