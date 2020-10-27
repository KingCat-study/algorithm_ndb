package stepbystep.eight;

import java.util.Scanner;

public class Main_1011 {

	public static void main(String[] args) {
    	
    	Scanner kb = new Scanner(System.in);
    	
    	int t = kb.nextInt();
    	
    	for (int i = 0; i < t; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			System.out.println(calcNum(x,y));
		}
    	
    	kb.close();
    }
    
    public static int calcNum(int x, int y) {
		/*
		 * 		출처 : https://www.acmicpc.net/problem/1011
		    	<규칙 1>
		
		    	max 의 값은 distance 의 루트 값에서 소수점을 버린 정수값이랑 같다.
		
		    	max = (int) Math.sqrt ( distance ) ;
		
		    	 
		
		    	(참고로 자바에서 루트 값을 구하는 메소드는 Math.sqrt() 이고 double 형이 return 된다.)
		
		
		
		    	<규칙 2>
		
		    	max 가 변하는 지점과 다음 지점 사이에는 항상 count 가 두 번씩 변한다.
		
		    	즉, 녹색 구간 사이에 노란색 칸이 두 번 포함된다.
		
		
		
		    	<규칙 3>
		
		    	녹색 칸 다음에는 반드시 count (노란색) 가 변한다.
		
		    	이는 당연한게 녹색칸은 Count 가 갈 수 있는 최대 거리이기 때문이다.
		
		
		
		    	<규칙 4>
		
		    	max 값이 변할 때의 Count 는 다음 수식을 따른다.
		
		    	Count = ( 2 × max - 1 )*/
    	
    	int distance = y - x;
    	int max = (int)Math.sqrt(distance); //max 는 distance 의 루트값에서 소수 점을 버린값과 같음.
    	
    	if(max == Math.sqrt(distance)) {
    		return (2 * max -1);
    	} else if(distance <= max * max + max) {
    		return (2 * max);
    	} else {
    		return (2 * max + 1);
    	}
    }
}
