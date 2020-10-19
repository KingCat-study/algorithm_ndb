package stepbystep.seven;

import java.util.Scanner;

public class Main_2941 {
	public static void main(String[] args) {
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		int cnt = 0;
		
		kb.close();
		
		for (int i = 0; i < croatia.length; i++) {
			while(str.contains(croatia[i])) {
				cnt++;
				str = str.replaceFirst(croatia[i], " ");
//				System.out.println(str);
			}
		}
		
		str = str.replace(" ", "");
		cnt = cnt + str.length();
		System.out.println(cnt);
		
	}
}
