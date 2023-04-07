package graphtheory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CycleDetection {
	/*
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * CreateGraph< Integer> createGraph= new CreateGraph<Integer>(); Graph<Integer>
	 * graph= createGraph.create(Integer.class,false); //graph.printGraph();
	 * 
	 * // creating map to store all the nodes into it
	 * 
	 * Map<Integer, Boolean> nodeMap= new HashMap<Integer, Boolean>();
	 * 
	 * //adding all the nodes to the map Set<Integer> li= graph.getGraph().keySet();
	 * 
	 * Iterator<Integer> iterator = li.iterator(); while (iterator.hasNext()) {
	 * Integer value = iterator.next(); nodeMap.put(value, false); }
	 * 
	 * 
	 * //creating queue to check all the nodes
	 * 
	 * Queue<Integer> q=new LinkedList<Integer>();
	 * 
	 * Integer firstNode= graph.getGraph().keySet().stream().findFirst().get();
	 * Map<Integer, Integer> parentNode= new HashMap<Integer, Integer>();
	 * q.add(firstNode); parentNode.put(firstNode, firstNode); boolean
	 * cyclePresent=detectCycle(q,graph,nodeMap, parentNode);
	 * System.out.println(cyclePresent); }
	 * 
	 * private static boolean detectCycle(Queue<Integer> q, Graph<Integer> graph,
	 * Map<Integer, Boolean> nodeMap,Map<Integer, Integer> parentNode) {
	 * 
	 * if( q.isEmpty() ) { return false;
	 * 
	 * }
	 * 
	 * Integer vertices = q.peek(); q.remove();
	 * 
	 * //marking this nodes as visited nodeMap.put(vertices, true);
	 * 
	 * // add adjanency nodes to the queue if they are not visited
	 * 
	 * List<Integer> nodesToBeVisited= graph.getGraph().get(vertices);
	 * 
	 * for(Integer n: nodesToBeVisited) {
	 * 
	 * if(!nodeMap.get(n)) { q.add(n); nodeMap.put(n, true); parentNode.put(n,
	 * vertices); } else { if(parentNode.get(vertices)!=n) { return true; } } }
	 * 
	 * return detectCycle(q, graph, nodeMap,parentNode);
	 * 
	 * }
	 * 
	 */}
