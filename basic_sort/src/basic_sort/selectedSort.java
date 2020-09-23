package basic_sort;

//시간 복잡도 10 * (10 + 1) / 2 
// N * (N + 1) / 2
// O(N * N)
//O(N*N) 또는 O(N^2)
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
