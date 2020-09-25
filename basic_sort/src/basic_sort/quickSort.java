package basic_sort;

public class quickSort {

	private void qSort(int [] data, int start,int end) {
		
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start +1;
		int j = end;
		
		while(i <= j) { //i 가 j 보다 크지 않을때 까지
			while(i <= end && data[i] <= data[key]) { // data[i] 가  data[key] 다 크면
				i++;
			}
			while(j > start && data[j] >= data[key]) { //data[j] 가 data[key] 보다 작으면
				j--;
			}
			
			if(i < j) {
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
			} else {
				int tmp = data[j];
				data[j] = data[key];
				data[key] = tmp;
			}
		}
		
		qSort(data,start, j-1);
		qSort(data,j+1, end);
		
	}
	
	public static void main(String[] args) {
		int [] data = {5,8,2,4,7,6,1,3,10,9};
		
		quickSort qk = new quickSort();
		qk.qSort(data, 0, data.length-1);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
