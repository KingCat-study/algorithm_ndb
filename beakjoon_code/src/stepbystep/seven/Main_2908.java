package stepbystep.seven;

import java.util.Scanner;

public class Main_2908 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		kb.close();
		
		int revA = reverseInt(a);
		int revB = reverseInt(b);

		if(revA > revB) {
			System.out.println(revA);
		} else if(revB > revA){
			System.out.println(revB);
		}
	}
	
	public static int reverseInt(int x) {
		int num1 = x % 10 * 100; //1의 자리 수를 100의 자리수로 변경
		int num2 = x / 10 % 10 *10; // 10의 자리수를 10의 자리수로 유
		int num3 = x / 100 % 10; // 100의 자리수를 1의 자리수로 변경
		
		return num1+num2+num3;
	}
}
