package stepbystep.twelve;

import java.util.Scanner;

public class Main_1427 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		kb.close();
		
		int[] arr = new int[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i)-'0';
		}
		
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}
