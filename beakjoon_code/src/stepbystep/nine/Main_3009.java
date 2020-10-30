package stepbystep.nine;

import java.util.Scanner;

public class Main_3009 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int x1 = kb.nextInt();
		int y1 = kb.nextInt();
		
		int x2 = kb.nextInt();
		int y2 = kb.nextInt();
		
		int x3 = kb.nextInt();
		int y3 = kb.nextInt();
		
		int x4 = 0;
		int y4 = 0;
		
		kb.close();
		
		if(x1 == x2) {
			x4 = (x1 - x2) + x3;
		} else if(x2 == x3) {
			x4 = (x2 - x3) + x1;
		} else {
			x4 = (x1 - x3) + x2;
		}
		
		if(y1 == y2) {
			y4 = (y1 - y2) + y3;
		} else if(y2 == y3) {
			y4 = (y2 - y3) + y1;
		} else {
			y4 = (y1 - y3) + y2;
		}
		
		System.out.println(x4 + " " + y4);
	}
}
