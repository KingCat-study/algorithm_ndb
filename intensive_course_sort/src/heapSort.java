
public class heapSort {

	public static void main(String[] args) {
		int [] heap = {7,6,5,8,3,5,9,1,6};
		
		//힙 구성 하기
		for (int i = 1; i < heap.length; i++) {
			int c = i;
			while(c != 0) {
				int root = (c - 1) / 2;
				if(heap[root] < heap[c]) {
					int tmp = heap[root];
					heap[root] = heap[c];
					heap[c] = tmp;
				}
				c = root;
			}
		}
		
		for (int i = heap.length - 1; i >= 0; i--) {
			int tmp = heap[0];
			heap[0] = heap[i];
			heap[i] = tmp;
			int root = 0;
			int c = 1;
			
			while(c < i) {
				c = 2 * root + 1; 				//왼쪽 자식 노드 찾기
				
				//왼쪽 자식 보다 오른쪽 자식이 크다면 인덱스를 오른쪽 자식으로 이동
				if(c < i -1 && heap[c] < heap[c+1]) {
					c++;
				}
				//c 가 i 를 벗어나면 안되므로 c < i
				if(c < i && heap[root] < heap[c]) {
					tmp = heap[root];
					heap[root] = heap[c];
					heap[c] = tmp;
				}
				root = c;
			}
		}
		
		for (int i = 0; i < heap.length; i++) {
			System.out.printf("%d ",heap[i]);
		}
	}
}
