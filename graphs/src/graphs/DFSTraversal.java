package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DFSTraversal <T> {
	void DFS(T node,HashMap<T,LinkedList<T>> graph,HashSet <T>visited){
		visited.add(node);
		System.out.println(node);
		LinkedList<T>  adjNodes= new LinkedList<>();
		adjNodes=graph.get(node);
		if(adjNodes!=null)
		for(T adjnode:adjNodes){
			if(!visited.contains(adjnode)){
				DFS(adjnode,graph,visited);
			}
		}
		
	}
public static void main(String []args){
	//Graph<Integer> graph= new Graph<>();
	Graph<Integer> graph = new Graph<>();
	/*graph.addEdge(0, 3);
	graph.addEdge(1, 3);
	graph.addEdge(3, 4);
	graph.addEdge(2, 4);
	graph.addEdge(1, 2);
	graph.addEdge(0, 3);
	graph.addEdge(3, 1);*/
	
	graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);

	HashSet <Integer>visited= new HashSet<>();
	DFSTraversal<Integer> dfs= new DFSTraversal<>();
	dfs.DFS(0,graph.getMap(),visited);
	
}
}
