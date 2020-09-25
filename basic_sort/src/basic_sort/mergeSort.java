package basic_sort;


//시간 복잡도는 O(N*logN) 을 보장. 퀵정렬보다 이점이 있다.
public class mergeSort {

	static int size = 10;
	int [] sorted = new int[size];
	
	private void merge(int [] data ,int start,int middle, int end) {
		int i = start;
		int j = middle + 1;
		int k = i;
		
		while(i <= middle && j <= end) {
			if(data[i] < data[j]) {
				sorted[k++] = data[i++];
			} else {
				sorted[k++] = data[j++];	
			}
		}
		
		if(i > middle) {
			for (int t = j; t <= end; t++) {
				sorted[k++] = data[t];	
			}
		} else {
			for (int t = i; t <= middle; t++) {
				sorted[k++] = data[t];
			}
		}
		
		for (int t = start; t <= end; t++) {
			data[t] = sorted[t];
		}
	}
	
	private void doMergeSort(int [] data, int start, int end) {
		
		if(start < end) {
			int middle = (start + end) / 2;
			doMergeSort(data, start , middle);
			doMergeSort(data, middle +1 , end);
			merge(data, start, middle, end);
		}
	}
	
	public static void main(String[] args) {
		int [] array = new int[size];
		array = new int[]{1,10,5,8,7,6,4,3,2,9};
		
		mergeSort app = new mergeSort();
		app.doMergeSort(array, 0, size-1);
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
}
