package basic_sort;


//시간 복잡도 O(N^2) 이지만 
//선택 정렬, 버블 정렬보다 대부분의 상황에서 성능이 좋다.
public class insertSort {
	public static void main(String[] args) {
		int [] array = {1,10,5,8,7,6,4,3,2,9};
		
		for (int i = 0; i < array.length-1; i++) {
			for (int k = i; array[k] > array[k+1]; k--) {
				int tmp = array[k];
				array[k] = array[k+1];
				array[k+1] = tmp;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
