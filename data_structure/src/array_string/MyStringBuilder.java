package array_string;

import java.util.ArrayList;

public class MyStringBuilder {
	
	private ArrayList<String> words;

	public MyStringBuilder() {
		this.words = new ArrayList<>();
	}
	
	public void append(String word) {
		this.words.add(word);
	}
	
	public String toString() {
		String str = "";
		for(String w : this.words) {
			str = str + w;
		}
		return str;
	}
}
