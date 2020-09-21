package basic_sort;

//등차 수열 10 * (10 + 1) / 2 
// N * (N + 1) / 2
// O(N * N)
// 선택 정렬의 수행시간은 빅오(N*N) 혹은 O(N^2) 이다.
public class selectedSort {

	public static void main(String[] args) {
		int min = 0 , tmp = 0, index = 0;
		int [] array = {1,10,5,8,7,6,4,3,2,9};
		
		for (int i = 0; i < array.length; i++) {
			min = 9999;
			for (int j = i; j < array.length; j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			tmp = array[i];
			array[i] = array[index];
			array[index] = tmp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
