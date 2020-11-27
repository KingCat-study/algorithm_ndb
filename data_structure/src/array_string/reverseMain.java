package array_string;

//공백(null) 로 끝나는 문자열을 null 제외하고 뒤집는 reverse 함수 작성
public class reverseMain {

	public static void main(String[] args) {
		String str = "abcefg ";
		System.out.println(reverseStr(str));
	}
	
	public static String reverseStr(String word) {
		char[] value = new char[word.length()-1];
		word.getChars(0, word.length()-1, value, 0);
		
		int start = 0;
		int end = value.length-1;
		char tmp;
		
		while(start < end) {
			tmp = value[start];
			value[start] = value[end];
			value[end] = tmp;
			
			start++;
			end--;
		}
		
		return new String(value);
	}
}
