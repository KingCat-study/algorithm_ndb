package stepbystep.ten;

import java.util.Scanner;

public class Main_10872 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		kb.close();
		
		System.out.println(multiple(a));
		System.out.println(multipleRev(1,a));
	}
	
	public static int multiple(int b) {
		if(b == 0 || b == 1) {
			return 1;
		} else {
			return b * multiple(b-1);
		}
	}
	
	public static int multipleRev(int b,int c) {
		if(b == c) {
			return c;
		} else {
			return b * multipleRev(b+1,c);
		}
	}
}
