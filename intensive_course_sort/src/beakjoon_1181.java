import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class beakjoon_1181 {

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
