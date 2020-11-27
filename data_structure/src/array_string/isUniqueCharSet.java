package array_string;


/*
문자열 내의 모든 문자가 유니크 한지를 판단 하는 기능 -> 단, 다른 자료구조는 사용 불가
문자는 ASCII 로 지정
 */
public class isUniqueCharSet {

	public static void main(String[] args) {
		String str = "abcdb";
		
		System.out.println(isUnique(str));
	}
	
	public static boolean isUnique(String word) {
		//ASCII 에서 사용하는 총 문자의 수는 256 개이고 문자열의 길이가 256을 넘었다면 중복이 발생 한 경우이므로 false 를 반환
		if(word.length() > 256) {
			return false;
		}
		
		boolean[] char_set = new boolean[256];
		
		//문자열 전체를 탐색 하면서 해당 문자에 해당하는 불린 배열의 index 에 true 체크
		//만약 해당 문자에 해당하는 불린 배열의 index 가  이미 true 라면 중복이 발생 한 경우이므로 false 반환
 		for (int i = 0; i < word.length(); i++) {
			int val = word.charAt(i);
			if(char_set[val]) {
				return false;
			}
			
			char_set[val] = true;
		}
		
		return true;
	}
}
