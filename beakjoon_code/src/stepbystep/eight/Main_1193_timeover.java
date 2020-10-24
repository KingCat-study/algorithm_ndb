package stepbystep.eight;

import java.util.Scanner;

//시간 초과
public class Main_1193_timeover {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int sum = 0;
		int x = 1;
		int y = 1;
		int t = 1;
		String str = "";
		
		kb.close();
		
		while(true) {

			if(t%2 == 0) {//t 가 짝수 일 때는  T 가 분모
				x = t;
				y = 1;
				for (int i = 0; i < t; i++) {
					if(sum == n) {
						break;
					}
					str = y+"/"+x;
					sum++;
					x--;
					y++;
				}
			} else { //t가 홀수 일 때는  T 가 분자
				y = t;
				x = 1;
				for (int i = 0; i < t; i++) {
					if(sum == n) {
						break;
					}
					str = y+"/"+x;
					sum++;
					x++;
					y--;
				}
			}
			
			if(sum == n) {
				break;
			}
			t++;
		}
		System.out.println(str);
	}
}
