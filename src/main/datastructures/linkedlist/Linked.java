package linkedlist;

public class Linked<T> {
	
	Node<T> head;

	static class Node<T> {

		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Linked<Integer> list= new Linked<Integer>();
		list.addLast(list, 20);
		list.addLast(list, 30);
		list.addLast(list, 40);
		list.addLast(list, 50);
		list.addLast(list, 60);
		list.addLast(list, 70);
		
		printLinkedlist(list);
		
		list.addLast(list, 90, 3);
		System.out.println("after Insertion at ith position");
		printLinkedlist(list);
		
	}

	private void addLast(Linked<Integer> list, int i, int j) {
		int count=1;
		if(list.head==null) {
			System.out.println("LinkedList is empty");
		}else {
			
			Node<Integer> n= list.head;
			while(count<j) {
				n=n.next;
				count++;
			}
			Node<Integer> newNode= new Node<Integer>(i);
			newNode.next=n.next;
			n.next=newNode;
		}
	}

	private static void printLinkedlist(Linked list) {
		Node<Integer> node= list.head;
		if(list.head==null) {
			System.out.println("LinkedList is null");
		}
		else {
			while(node.next!=null) {
				System.out.print(node.data+ "  ");
				node= node.next;
			}
		}
	}

	private <T> void addLast(Linked list, T i) {
		
		Node<T> node= new Node<T>(i);
		
		if(list.head==null) {
			list.head=node;
		}else {
			Node<T> index= list.head;
			while(index.next!=null) {
				index=index.next;
			}
			index.next=node;
		}
	}
}
