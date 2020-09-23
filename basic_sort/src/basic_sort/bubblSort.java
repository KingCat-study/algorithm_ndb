package basic_sort;

// 비교 연산의 횟수 
// 등차수열  N * (N+1) / 2
// O(N*N) 또는 O(N^2)
// 선택 정렬과 시간복잡도는 같지만 버블정렬이 선택정렬보다 더 느린이유는 버블 정렬은 이중 반복문 안에서 수열의 자리를 계속 변경하기 때문 - 선택 정렬은 바깥 반복문에서 한번만 자리 변경 
public class bubblSort {

	public static void main(String[] args) {
		int [] array = {1,10,5,8,7,6,4,3,2,9};
		
//		for (int i = array.length-1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if(array[j] > array[j+1]) {
//					int tmp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = tmp;
//				}
//			}
//		}
		
		//방법 2
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < (array.length-1) - i; j++) {
				if(array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
