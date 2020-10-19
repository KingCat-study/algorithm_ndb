package stepbystep.seven;

import java.util.Scanner;

public class Main_5622 {
	public static void main(String[] args) {
		String[] dai = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		kb.close();
		
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int a = 0;
			for (int j = 0; j < dai.length; j++) {
				if(String.valueOf(str.charAt(i)).equals("0")){
					a = 11;
				} else if(String.valueOf(str.charAt(i)).equals("1")){
					a = 2;
				} else if(dai[j].contains(String.valueOf(str.charAt(i)))) {
					a = j+1;
				}
			}
			sum = sum + a;
		}
		System.out.println(sum);
	}
}
