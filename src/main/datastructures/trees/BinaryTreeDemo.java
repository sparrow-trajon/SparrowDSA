package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeDemo {

	private static Node<Integer> root = null;
	private static Node<Integer> root1 = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Node<Integer>> q = new LinkedList<>();
		System.out.println("Enter the data for tree1 ");
		root = BuildBinaryTree(scanner, root);
		// System.out.println(root);
		// printLevelOrderTreaversal(root, q);
		// printReverseLevelOrderTraversal(root);
		// System.out.println("In order traversal ");
		// inOrderTraversal(root);
		// System.out.println("Pre order traversal ");
		// preOrderTraversal(root);
		// System.out.println("Post order traversal ");
		// postOrderTraversal(root);

		// Height of the tree
		// int h=getHeight(root);
		// int h=getHeightWithRecursion(root);
		// System.out.println("height of tree >>"+h);

		// getting the diameter of the tree
		// int d=diameter(root);
		// System.out.println("diameter of the tree is >>> "+ d);
		// System.out.println("Enter the data for root2 >> ");
		// root1 = BuildBinaryTree(scanner, root1);
		// boolean identical = treesIdentical(root, root1);

		// System.out.println( identical);

		// Pair<Integer, Boolean> ifCheckSum = checkSum(root);
		// System.out.println(ifCheckSum.getValue());

		// zigzagPrint(root);
		// printAllLeafNodes(root);
		/*
		 * System.out.println("Printing all left nodes without left node");
		 * printAllLeftNodesExceptLeaf(root);
		 * System.out.println("printing all right nodes in reverse order");
		 * printRightNodesInReverseOrder(root);
		 */

		boundaryTraversal(root);
	}

	private static void boundaryTraversal(Node<Integer> root) {
		List<Integer> list= new ArrayList<Integer>();
		if(root==null) {
			return ;
		}
		list.add(root.getData());
		System.out.println("printing root node");
		printAllLeftNodesExceptLeaf(root.getLeft(), list);
		System.out.println("printing only left nodes");
		System.out.println(Arrays.toString(list.toArray()));
		printAllLeafNodes(root, list);
		System.out.println("printing leaf nodes");
		System.out.println(Arrays.toString(list.toArray()));
		printRightNodesInReverseOrder(root.getRight(),list);
		System.out.println("Printing right nodes");
		System.out.println(Arrays.toString(list.toArray()));
		
	}

	private static void printRightNodesInReverseOrder(Node<Integer> root2, List<Integer> list) {

		if ((root2 == null) || (root2.getLeft()==null && root2.getRight()==null)) {
			return;
		}
		
		if(root2.getRight()!=null)
		printRightNodesInReverseOrder(root2.getRight(), list);
		else
			printRightNodesInReverseOrder(root2.getLeft(), list);
			
		list.add(root2.getData());
	}

	private static void printAllLeafNodes(Node<Integer> root, List<Integer> list) {

		if (root == null) {
			return;
		}
		printAllLeafNodes(root.getLeft(), list);
		printAllLeafNodes(root.getRight(), list);

		if (root.getLeft() == null && root.getRight() == null)
			list.add(root.getData());
	}

	private static void printAllLeftNodesExceptLeaf(Node<Integer> root, List<Integer> list) {

		if ((root == null) || (root.getLeft()==null && root.getRight()==null)) {
			return;
		}
			list.add(root.getData());
			if(root.getLeft()!=null)
				printAllLeftNodesExceptLeaf(root.getLeft(), list);
			else {
				printAllLeftNodesExceptLeaf(root.getRight(), list);
				
			}
			
		// if (root.getLeft() != null && root.getRight() == null)
	}

	private static void zigzagPrint(Node<Integer> root) {

		boolean rightToLeft = false;
		Queue<Node<Integer>> q = new LinkedList<Node<Integer>>();

		if (root == null) {
			return;
		}
		List<Integer> res = new ArrayList<Integer>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			int[] temp = new int[q.size()];

			for (int i = 0; i < size; i++) {
				Node<Integer> n = q.peek();
				q.remove();

				int index = (!rightToLeft) ? i : size - i - 1;

				temp[index] = (n.getData());

				if (n.getLeft() != null)
					q.add(n.getLeft());
				if (n.getRight() != null)
					q.add(n.getRight());

			}
			rightToLeft = !rightToLeft;

			for (int i = 0; i < temp.length; i++) {
				res.add(temp[i]);
			}

		}

		System.out.println(Arrays.toString(res.toArray()));

	}

	private static Pair<Integer, Boolean> checkSum(Node<Integer> root2) {

		if (root2 == null) {
			System.out.println("Checking the root node >> " + root2);
			Pair<Integer, Boolean> p = new Pair<>();
			p.setKey(0);
			p.setValue(true);
			return p;
		}
		System.out.println("Checking the root node >> " + root2.getData());

		Pair<Integer, Boolean> lp = checkSum(root2.getLeft());
		Pair<Integer, Boolean> rp = checkSum(root2.getRight());

		int leftSum = lp.getKey();
		int rightSum = rp.getKey();

		System.out.println("left sum from the node is >> " + leftSum);
		System.out.println("right sum from the node is >> " + rightSum);
		System.out.println("Current data is  >> " + root2.getData());

		boolean current = true;
		if (root2.getLeft() != null || root2.getRight() != null)
			current = (root2.getData() == leftSum + rightSum) ? true : false;
		Pair<Integer, Boolean> result = new Pair<>();

		if (lp.getValue() && rp.getValue() && current) {
			result.setValue(true);
		} else {
			result.setValue(false);
		}
		result.setKey(leftSum + rightSum + root2.getData());
		return result;
	}

	private static boolean treesIdentical(Node<Integer> root1, Node<Integer> root2) {

		if (root1 == null && root2 == null)
			return true;
		if (root1 != null && root2 == null)
			return false;
		if (root1 == null && root2 != null)
			return false;
		boolean l = treesIdentical(root1.getLeft(), root2.getLeft());
		boolean r = treesIdentical(root1.getRight(), root2.getRight());
		boolean data = root1.getData() == root2.getData();
		if (l && r && data)
			return true;
		else
			return false;
	}

	private static Pair<Integer, Integer> getDiameter(Node<Integer> root) {

		if (root == null) {
			return new Pair<>(0, 0);
		}

		Pair<Integer, Integer> p1 = getDiameter(root.getLeft());
		Pair<Integer, Integer> p2 = getDiameter(root.getRight());
		int dl = p1.getKey();
		int dr = p2.getKey();
		int h = p1.getValue() + p2.getValue() + 1;
		Pair<Integer, Integer> ans = new Pair<Integer, Integer>();
		ans.setKey(h > (dl > dr ? dl : dr) ? h : (dl > dr ? dl : dr));
		ans.setValue(p1.getValue() > p2.getValue() ? p1.getValue() : p2.getValue());

		return ans;

	}

	private static int diameter(Node<Integer> root2) {

		if (root2 == null)
			return 0;

		int dl = diameter(root2.getLeft());
		int dr = diameter(root2.getRight());
		int h = getHeightWithRecursion(root2.getLeft()) + getHeightWithRecursion(root2.getRight()) + 1;
		System.out.println("dl" + dl + "dr " + dr + "  h" + h + " root node >>" + root2.getData());
		return h > (dl > dr ? dl : dr) ? h : (dl > dr ? dl : dr);
	}

	/**
	 * return the height of the tree using recursion
	 * 
	 * @param root
	 * @return
	 */
	private static int getHeightWithRecursion(Node<Integer> root) {

		if (root == null) {
			return 0;
		}
		int lh = getHeightWithRecursion(root.getLeft());
		int rh = getHeightWithRecursion(root.getRight());

		return (rh > lh) ? rh + 1 : lh + 1;
	}

	/**
	 * return the height of a binary tree using queue.
	 * 
	 * @param root
	 * @return
	 */
	private static int getHeight(Node<Integer> root) {
		int height = 0;
		Queue<Node<Integer>> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		height++;
		while (!q.isEmpty()) {
			Node<Integer> n = q.peek();
			q.remove();

			if (n == null && !q.isEmpty()) {
				q.add(null);
				height++;
			} else if (n != null) {
				if (n.getLeft() != null)
					q.add(n.getLeft());
				if (n.getRight() != null)
					q.add(n.getRight());
			}
		}

		return height;
	}

	/**
	 * Print in order traversal
	 * 
	 * @param root
	 */
	private static void inOrderTraversal(Node<Integer> root) {

		if (root == null) {
			return;
		}
		inOrderTraversal(root.getLeft());
		System.out.println(root.getData() + " ");
		inOrderTraversal(root.getRight());
	}

	private static void preOrderTraversal(Node<Integer> root) {

		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
	}

	/**
	 * print post order traversal
	 * 
	 * @param root
	 */
	private static void postOrderTraversal(Node<Integer> root) {

		if (root == null) {
			return;
		}
		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.println(root.getData() + " ");
	}

	/**
	 * Print reverse level of traversal
	 * 
	 * @param root
	 */
	private static void printReverseLevelOrderTraversal(Node<Integer> root) {

		Stack<Integer> s = new Stack<>();
		Queue<Node<Integer>> q = new LinkedList<Node<Integer>>();

		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node<Integer> n = q.peek();
			q.remove();
			if (n == null) {
				if (!q.isEmpty())
					q.add(null);
			} else {
				s.push(n.getData());
				if (n.getLeft() != null)
					q.add(n.getLeft());
				if (n.getRight() != null)
					q.add(n.getRight());
			}
		}

		System.out.println("stack is >>" + Arrays.toString(s.toArray()));
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

	/**
	 * print all the nodes in level order traversal
	 * 
	 * @param root
	 * @param q
	 */
	private static void printLevelOrderTreaversal(Node<Integer> root, Queue<Node<Integer>> q) {

		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node<Integer> n = q.peek();
			q.remove();

			if (n == null) {
				System.out.println("");
				if (!q.isEmpty()) {
					q.add(null);
				}
			} else {
				if (n.getData() != null)
					System.out.print(n.getData() + " ");
				if (n.getLeft() != null)
					q.add(n.getLeft());
				if (n.getRight() != null)
					q.add(n.getRight());
			}

		}

	}

	/**
	 * Method to create a binary tree
	 * 
	 * @param sc
	 * @param node
	 * @return
	 */
	private static Node BuildBinaryTree(Scanner sc, Node<Integer> node) {

		System.out.println("enter the data>>");
		Integer data = sc.nextInt();
		node = new Node<Integer>(data);

		if (data == -1) {
			return null;
		}
		System.out.println("Enter the data for left node of " + data);
		node.setLeft(BuildBinaryTree(sc, node.getLeft()));

		System.out.println("Enter the data for right node of " + data);
		node.setRight(BuildBinaryTree(sc, node.getRight()));
		return node;
	}

}
