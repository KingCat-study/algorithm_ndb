import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*시리얼번호 A가 시리얼번호 B의 앞에 오는 경우는 다음과 같다.

A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
*/
public class beakjoon_1431 {

	private static class StrCompare implements Comparable<StrCompare> {

		public String str;
		
		public StrCompare(String str) {
			this.str = str;
		}

		@Override
		public int compareTo(StrCompare o) {
			if(this.str.length() < o.str.length()) {
				return -1;
			} else if(this.str.length() > o.str.length()){
				return 1;
			} else {
				return this.str.compareTo(o.str);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		List<StrCompare> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String str = kb.next();
			list.add(new StrCompare(str));
		}

		kb.close();
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			if(i > 0 && list.get(i).str.equals(list.get(i-1).str)) {
				continue;
			}
			sb.append(list.get(i).str).append("\n");
		}
		System.out.println(sb);
	}
}
