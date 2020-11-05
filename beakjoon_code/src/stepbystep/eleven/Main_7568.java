package stepbystep.eleven;

import java.util.Scanner;

public class Main_7568 {

	public static int[] weigth;
	public static int[] tall;
	public static int[] rank;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		weigth = new int[n];
		tall = new int[n];
		rank = new int[n];
		
		for (int i = 0; i < n; i++) {
			weigth[i] = kb.nextInt();
			tall[i] = kb.nextInt();
		}
		
		kb.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				} else if(weigth[i] < weigth[j] && tall[i] < tall[j]){
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(rank[i]+1 + " ");
		}
	}
}
