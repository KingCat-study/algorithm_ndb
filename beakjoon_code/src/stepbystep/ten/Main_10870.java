package stepbystep.ten;

import java.util.Scanner;

public class Main_10870 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		
		kb.close();
		
		System.out.println(fibonachi(a));
	}
	
	public static int fibonachi(int n) {
		if(n < 2) {
			return n;
		} else {
			return fibonachi(n-1) + fibonachi(n-2);
		}
	}
}
