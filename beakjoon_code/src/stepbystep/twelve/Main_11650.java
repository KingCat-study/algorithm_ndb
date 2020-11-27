package stepbystep.twelve;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11650 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		Point[] arr = new Point[n];
		
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr[i] = new Point(x,y);
		}
		
		kb.close();
		
		Arrays.sort(arr);
		
		for (Point p : arr) {
			System.out.println(p.x + " " + p.y);
		}
	}
}

class Point implements Comparable<Point> {
	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {
			if(this.y < o.y) {
				return -1;
			} else if(this.y == o.y){
				return 0;
			} else {
				return 1;
			}
		} else if(this.x < o.x) {
			return -1;
		} else {
			return 1;
		}
	}
}
