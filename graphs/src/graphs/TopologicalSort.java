package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class TopologicalSort<T> {

	public void TopoLogicalSort(HashMap<T,LinkedList<T>> graph){
		HashSet <T>visited= new HashSet<>();
		Stack<T> path= new Stack<T>();
		for(Map.Entry<T, LinkedList<T>> nodes: graph.entrySet()){
			if(!visited.contains(nodes.getKey()))
			TopologicalSortUtil(nodes.getKey(),graph,visited,path);
		}
		while(path.size()>0){
			System.out.println(path.pop());
		}
	}
	public void TopologicalSortUtil(T node,HashMap<T,LinkedList<T>> graph, HashSet<T> visited,Stack<T> path)
	{    
		visited.add(node);
		if(graph.get(node)==null){
			path.add(node);
			
		}
		else{
			LinkedList<T> adjNodes= graph.get(node);
			for(T adjNode: adjNodes){
				if(!visited.contains(adjNode)){
					TopologicalSortUtil(adjNode,graph,visited,path);
				}
			}
			path.add(node);
		}
	}
	public static void main(String []args){
		Graph<Integer> graph = new Graph<>();
		/*graph.addEdge(0, 1);
	    graph.addEdge(0, 2);
	    graph.addEdge(1, 2);
	    graph.addEdge(2, 0);
	    graph.addEdge(2, 3);
	    graph.addEdge(3, 3);*/
		graph.addEdge(5, 2);
	    graph.addEdge(5, 0);
	    graph.addEdge(4, 0);
	    graph.addEdge(4, 1);
	    graph.addEdge(2, 3);
	    graph.addEdge(3, 1);
	    TopologicalSort<Integer> app= new TopologicalSort<>();
	    System.out.println(graph.getMap());
	    app.TopoLogicalSort(graph.getMap());
		
		
	}
}
