package stepbystep.eleven;

import java.util.Scanner;

public class Main_2789 {

	static int n = 0;
	static int m = 0;
	static int[] arr;
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		kb.close();
		
		int d = getVal();
		
		System.out.println(d);
	}
	
	public static int getVal() {
		int result = 0;
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i+1; j < n - 1; j++) {
				for (int k = j+1; k < n; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					
					if(m == temp) {
						return temp;
					}
					
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		return result;
	}
}
