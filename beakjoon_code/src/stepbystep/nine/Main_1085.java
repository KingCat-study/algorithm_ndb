package stepbystep.nine;

import java.util.Scanner;

public class Main_1085 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

		int x = kb.nextInt();
		int y = kb.nextInt();
		int w = kb.nextInt();
		int h = kb.nextInt();
		
		kb.close();
		
		int wMin = Math.min(x, w-x);
		int hMin = Math.min(y, h-y);
		
		System.out.println(Math.min(wMin, hMin));
	}
}
