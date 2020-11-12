package stepbystep.twelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2108 {
	/**
	 *  메모리 303772 kb	시간 1328 ms
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		1산술평균 : N개의 수들의 합을 N으로 나눈 값
		2중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		3최빈값 : N개의 수들 중 가장 많이 나타나는 값 여러개 있을 때는 두번째로 작은 값
		4범위 : N개의 수들 중 최댓값과 최솟값의 차이
		*/
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		int average = 0;
		int middleIndex = n / 2;
		int maxShowCnt = 0;
		
		int [] arr = new int[n];
		int [] cnt = new int[8001];
		
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			average = average + arr[i];
			cnt[arr[i] + 4000]++;
		}
		
		kb.close();
		
		
		Arrays.sort(arr);
		
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] != 0) {
				if(maxShowCnt < cnt[i]) {
					maxShowCnt = cnt[i];
				}
			}
		}
		
		ArrayList<Integer> modeList = new ArrayList<>();
		
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] == maxShowCnt) {
				modeList.add(i - 4000);
			}
		}
		
		System.out.println((int)Math.round((double)average/n));
		System.out.println(arr[middleIndex]);
		
		if(modeList.size() > 1) {
			System.out.println(modeList.get(1));
		} else {
			System.out.println(modeList.get(0));
		}
		
		System.out.println(arr[n-1] - arr[0]);
	}
}

