package stepbystep.eight;

import java.util.Scanner;

//복습 필요
public class Main_1193 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		kb.close();
		
		int lineCnt = 0;
		int cnt = 0;
		
		//등차수열의 법칙 이용. 몇 번째 줄에 위치한 항의 개수인지 판단. n(n+1)/2
		while(cnt < n) {
			lineCnt++;
			cnt = lineCnt * (lineCnt+1) / 2;
		}
		
//		System.out.println(cnt + " : " +lineCnt);
		int x,y = 0; // x분모 ,y분자
		
		if(lineCnt % 2 == 0) {
			y = 1 + (cnt - n);
			x = lineCnt - (cnt - n);
		} else {
			y = lineCnt - (cnt - n);
			x = 1 + (cnt - n);
		}
		
		System.out.println(x+"/"+y);
	}
}
