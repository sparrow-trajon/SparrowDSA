package graphtheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphUtil<T> {

	private Graph<T> graph;

	public Graph<T> create(Class<T> type, boolean direction) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the no of nodes>> ");
		int noOfNodes = sc.nextInt();

		System.out.println("Enter the no of edges");
		int noOfEdges = sc.nextInt();

		graph = new Graph(noOfNodes, noOfEdges, direction);

		System.out.println(" Enter the edges vertices ");

		List<Edge<T>> list = new ArrayList<>();
		for (int i = 1; i <= noOfEdges; i++) {
			System.out.println("Enter the source \n ");
			T s =null;
			if(type==Integer.class) {
				s= type.cast(Integer.parseInt(sc.next()));
			}else {
				s=type.cast( sc.next());
			}
			System.out.println("Enter the destination \n");
			T d = null;
	        if (type == Integer.class) {
	            d = type.cast(Integer.parseInt(sc.next()));
	        } else {
	            d = type.cast(sc.next());
	        }

			Edge<T> edge = new Edge(s, d);
			list.add(edge);

		}
		for (Edge<T> e : list) {
			graph.addNode(e);
		}

		return graph;
	}

}
