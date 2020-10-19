package stepbystep.seven;

import java.util.Scanner;

public class Main_1316 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String str = kb.next();
			
			String aphabet = "";
			boolean isGroup = true;
			
			for (int j = 0; j < str.length(); j++) {
				String char_one = String.valueOf(str.charAt(j));
				
				if(aphabet.contains(char_one)) {
					if((aphabet.length()-1) != aphabet.lastIndexOf(char_one)) {
						isGroup = false;
						break;
					}
				} else {
					aphabet = aphabet + char_one;
				}
			}
			
			if(isGroup) {
				cnt++;
			}
		}
		
		kb.close();
		System.out.println(cnt);
		
	}
}
