package stepbystep.eight;

import java.util.Scanner;

public class Main_2292 {
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		kb.close();
		
		int cnt = 1;
		int roomNum = 1;
		int addNum = 6;
		
		while(true) {
			if(n <= roomNum) {
				break;
			}
			
			roomNum = roomNum + addNum;
			addNum = addNum + 6;
			cnt++;
			System.out.println(roomNum + " : " + addNum + " : "+ cnt);
		}
		
		System.out.println(cnt);
	}
}
