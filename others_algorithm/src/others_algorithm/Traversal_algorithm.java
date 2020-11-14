package others_algorithm;

public class Traversal_algorithm {

	public static void main(String[] args) {
		
		int n = 15;
		
		TreeNode[] nodeList = new TreeNode[n+1];
		
		for (int i = 0; i < nodeList.length; i++) {
			nodeList[i] = new TreeNode(i);
		}
		
		for (int i = 0; i < nodeList.length; i++) {
			// 짝수는 왼쪽 노드 , 홀수는 오른쪽 노드 에 넣기 위함
			if(i % 2 == 0) {
				nodeList[i / 2].leftLink = nodeList[i];
			} else {
				nodeList[i / 2].reftLink = nodeList[i];
			}
		}
		
		System.out.print("전위 순회 : ");
		preOrder(nodeList[1]);
		System.out.println();
		System.out.print("중위 순회 : ");
		inOrder(nodeList[1]);
		System.out.println();
		System.out.print("후위 순회 : ");
		postOrder(nodeList[1]);
	}
	
	//전위 순회
	public static void preOrder(TreeNode node) {
		if(node != null) {
			System.out.print(node.data + " ");
			preOrder(node.leftLink);
			preOrder(node.reftLink);
		}
	}

	//중위 순회
	public static void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.leftLink);
			System.out.print(node.data + " ");
			inOrder(node.reftLink);
		}
	}
	
	//후위 순회
	public static void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.leftLink);
			postOrder(node.reftLink);
			System.out.print(node.data + " ");
		}
	}
}

class TreeNode {
	
	int data;
	TreeNode leftLink;
	TreeNode reftLink;

	public TreeNode(int data) {
		this.data = data;
		this.leftLink = null;
		this.reftLink = null;
	}
}
