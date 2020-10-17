package stepbystep.seven;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_1157 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
        
        String s = kb.next();
        kb.close();
        
        String lowerCaseS = s.toLowerCase();
        
		 int[] cntIndex = new int[s.length()];
		ArrayList<String> alpha = new ArrayList<>();
		
		for(int i = 0; i < lowerCaseS.length(); i++) {
			String j = String.valueOf(lowerCaseS.charAt(i));
			if(!alpha.stream().anyMatch(e -> e.equals(j))) {
				alpha.add(j);
			} else {
				cntIndex[alpha.indexOf(j)]++;
			}
		}
		
		int max = 0;
		int maxIndex = 0;
		String ans = "";
		for (int i = 0; i < cntIndex.length; i++) {
			if(cntIndex[i] > max) {
				max = cntIndex[i];
				maxIndex = i;
			}
		}
		
		ans = alpha.get(maxIndex).toUpperCase();
		
		for(int i = 0; i < cntIndex.length; i++) {
		    if(max == cntIndex[i] && maxIndex != i) {
		        ans = "?";
		    }
		}
		
		System.out.println(ans);
	}
}
