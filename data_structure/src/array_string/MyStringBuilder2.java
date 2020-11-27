package array_string;

import java.util.Arrays;

public class MyStringBuilder2 {
	
	private int count = 0;
	private char[] value;
	
	public MyStringBuilder2() {
		this.value = new char[16];
		this.count = 0;
	}
	
	public void append(String word) {
		int oldCount = count;
		count = oldCount + word.length();
		if(count > this.value.length) {
			value = Arrays.copyOf(value, value.length * 2);
		}
		word.getChars(0, word.length(), value, oldCount);
	}
	
	public String toString() {
		return new String(value,0,count);
	}
}
