package stepbystep.twelve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_10814 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Member> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int age = kb.nextInt();
			String name = kb.next();
			int num = i;
			arr.add(new Member(age,name,num));
		}
		
		kb.close();
		
		Collections.sort(arr);
		
		for(Member m : arr) {
			System.out.println(m.age + " " + m.name);
		}
	}
}

class Member implements Comparable<Member> {
	int age;
	String name;
	int num;
	
	public Member(int age, String name, int num) {
		this.age = age;
		this.name = name;
		this.num = num;
	}

	@Override
	public int compareTo(Member o) {
		if(this.age == o.age) {
			if(this.num < o.num) {
				return -1;
			} else if(this.num == o.num) {
				return 0;
			} else {
				return 1;
			}
		} else if(this.age < o.age) {
			return -1;
		} else {
			return 1;
		}
	}
}
