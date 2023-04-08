package graphtheory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class BFS {
	
	public static void main(String[] args) {
			
		GraphUtil< Integer> createGraph= new GraphUtil<Integer>();
		Graph<Integer> graph= createGraph.create(Integer.class, false);
		//graph.printGraph();
		
		// creating map to store all the nodes into it
		
		Map<Integer, Boolean> nodeMap= new HashMap<Integer, Boolean>();
		
		//adding all the nodes to the map
		Set<Integer> li= graph.getGraph().keySet();
		
		Iterator<Integer> iterator = li.iterator();
		while (iterator.hasNext()) {
		    Integer value = iterator.next();
		    nodeMap.put(value, false);
		}
		
		
		//creating queue to check all the nodes
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		Integer firstNode= graph.getGraph().keySet().stream().findFirst().get();
		q.add(firstNode);
		bfsTraversal(q,graph,nodeMap);
	}

	private static void bfsTraversal(Queue<Integer> q, Graph<Integer> graph, Map<Integer, Boolean> nodeMap) {
		
		
		if(q.isEmpty()  ) {
			return;
		}
		Integer vertices = q.peek();
		List<Integer> nodesToBeVisited= graph.getGraph().get(vertices);

		System.out.println(vertices);
		q.remove();
		
		//marking this nodes as visited
		nodeMap.put(vertices, true);
		
		// add adjanency nodes to the queue if they are not visited 
		
		
		if(nodesToBeVisited!=null) {
			for(Integer n: nodesToBeVisited) {
				if(nodeMap.get(n)==null || !nodeMap.get(n)) {
					q.add(n);
					nodeMap.put(n, true);
				}
			}
		}
		
		bfsTraversal(q, graph, nodeMap);
		
	}
}
