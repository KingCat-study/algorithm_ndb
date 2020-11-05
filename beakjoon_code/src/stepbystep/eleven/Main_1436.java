package stepbystep.eleven;

import java.util.Scanner;

public class Main_1436 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int min = 666;
		int cnt = 1;
		
		kb.close();
		
		while(n != cnt) {
			min++;
			if(String.valueOf(min).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(min);
	}
}
