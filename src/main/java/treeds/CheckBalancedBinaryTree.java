package treeds;

public class CheckBalancedBinaryTree {

	public static void main(String[] args) {

		Node<Integer> root = null;
		CreateBinaryTree<Integer> c = new CreateBinaryTree<Integer>();
		root = c.BuildBinaryTree(root);
		
		boolean x=checkIfTreeIsBalanced(root);
		System.out.println(x);
	}

	public static boolean checkIfTreeIsBalanced(Node<Integer> root) {

		if (root == null) {
			return true;
		}
		checkIfTreeIsBalanced(root.getLeft());
		checkIfTreeIsBalanced(root.getRight());
		int hl=getHeightWithRecursion(root.getLeft());
		int hr=getHeightWithRecursion(root.getRight());
		return (Math.abs(hl-hr))>1 ?false:true;
		
	}
	
	private static int getHeightWithRecursion(Node<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		int lh=getHeightWithRecursion(root.getLeft());
		int rh=getHeightWithRecursion(root.getRight());
		
		
		return (rh>lh)?rh+1:lh+1;
	}

}
