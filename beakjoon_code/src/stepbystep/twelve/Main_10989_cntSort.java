package stepbystep.twelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10989_cntSort {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int max = 10001;
		int [] arr = new int[n];
		int [] count = new int[max];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		
		for (int i = 1; i < max; i++) {
			if(count[i] != 0) {
				for (int j = 0; j < count[i]; j++) {
					sb.append(i).append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}
