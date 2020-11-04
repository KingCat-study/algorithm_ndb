package stepbystep.nine;

import java.util.Scanner;

public class Main_3053 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double r = kb.nextDouble();
		
		kb.close();
		
		System.out.printf("%6f",Math.PI * r * r);
		System.out.println();
		System.out.printf("%6f",2 * r * r);
	}
}
