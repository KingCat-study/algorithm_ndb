package stepbystep.nine;

import java.util.Scanner;

public class Main_4135 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if(c*c == ((a*a)+(b*b))) {
				System.out.println("right");
			} else if(a*a == (c*c)+(b*b)){
				System.out.println("right");
			} else if(b*b == (a*a)+(c*c)){
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		
		
		kb.close();
	}
}
