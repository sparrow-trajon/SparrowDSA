package treeds;

import java.util.Scanner;

public class CreateBinaryTree<T> {
	
	public static Scanner sc=  new Scanner(System.in);
	
	
	public static <T> Node<T> create(Node<T> node){
		System.out.println("enter the data>>");
		T data = (T)sc.next();
		node = new Node<>(data);

		if ((Integer)data == -1) {
			return null;
		}
		System.out.println("Enter the data for left node of " + data);
		node.setLeft(create( node.getLeft()));

		System.out.println("Enter the data for right node of " + data);
		node.setRight(create( node.getRight()));
		return node;
		
		
	}
	
	public static Node BuildBinaryTree( Node<Integer> node) {

		System.out.println("enter the data>>");
		Integer data = sc.nextInt();
		node = new Node<Integer>(data);

		if (data == -1) {
			return null;
		}
		System.out.println("Enter the data for left node of " + data);
		node.setLeft(BuildBinaryTree( node.getLeft()));

		System.out.println("Enter the data for right node of " + data);
		node.setRight(BuildBinaryTree( node.getRight()));
		return node;
	}
	
		
}
