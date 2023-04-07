package graphtheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {

	private int nodes;
	private int noOfEdges;
	private boolean direction;
	private List<Edge> edges;
	private Map<T, List<T>> graph = new LinkedHashMap();

	// created graph with no of nodes and no of edges with direction
	public Graph(int nodes, int edges, boolean direction) {

		this.nodes = nodes;
		this.noOfEdges = edges;
		this.direction = direction;
	}

	// add node to the graph

	public void addNode(Edge<T> edge) {

		if (graph == null) {
			graph = new HashMap<>();
		}

		addNewNode(edge);

		if (!this.direction) {
			Edge<T> e = new Edge(edge.getDestination(), edge.getSource());
			addNewNode(e);
		}

	}

	public void printGraph() {
		
		graph.entrySet().stream().forEach(x->{
			System.out.print(x.getKey() +" > "+ Arrays.toString(x.getValue().toArray())+"\n");
		});
	}
	private void addNewNode(Edge<T> edge) {
		if (graph.get(edge.getSource()) != null) {
			graph.get(edge.getSource()).add(edge.getDestination());
		} else {
			List<T> listOfEdge = new ArrayList<>();
			listOfEdge.add(edge.getDestination());
			graph.put(edge.getSource(), listOfEdge);
		}
	}

	public int getNodes() {
		return nodes;
	}

	public void setNodes(int nodes) {
		this.nodes = nodes;
	}

	public int getEdges() {
		return noOfEdges;
	}

	public void setEdges(int edges) {
		this.noOfEdges = edges;
	}

	public boolean isDirection() {
		return direction;
	}

	public void setDirection(boolean direction) {
		this.direction = direction;
	}

	public int getNoOfEdges() {
		return noOfEdges;
	}

	public void setNoOfEdges(int noOfEdges) {
		this.noOfEdges = noOfEdges;
	}

	public Map<T, List<T>> getGraph() {
		return graph;
	}

	public void setGraph(Map<T, List<T>> graph) {
		this.graph = graph;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	

}
