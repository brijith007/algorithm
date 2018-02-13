package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph<T> {
	int v;

	HashMap<T, LinkedList<T>> adjList2 = new HashMap<>();
	LinkedList<T> adjList[];

	/*
	 * Graph(int edges){ v= edges; adjList= new LinkedList[v]; for(int
	 * i=0;i<v;i++){ adjList[i]= new LinkedList<>(); } }
	 */
	void addEdge(T source, T destination) {
		LinkedList<T> edges = adjList2.get(source);
		if (edges == null) {
			edges = new LinkedList<>();
			edges.add(destination);
			adjList2.put(source, edges);
		} else {
			edges.add(destination);
			
		}
	}

	void print() {
		/*for (int i = 0; i < v; i++) {
			System.out.println(" ");
			System.out.print(i + "->");
			for (T edge : adjList[i]) {
				System.out.print(edge + ":");
			}
		}*/
		
		for(Map.Entry<T, LinkedList<T>> entry : adjList2.entrySet()){
			System.out.println(entry.getKey()+","+entry.getValue());
		}
	}

	public static void main(String[] args) {
		Graph<Integer> a1 = new Graph<>();
		a1.addEdge(0, 3);
		a1.addEdge(1, 3);
		a1.addEdge(3, 4);
		a1.addEdge(2, 4);
		a1.addEdge(1, 2);
		a1.addEdge(0, 3);
		a1.print();
		
		Graph<String> base2= new Graph<>();
		base2.addEdge("happy", "path");
		base2.addEdge("happy", "code");
		base2.addEdge("happy", "dist");
		base2.addEdge("dist", "coln");
		base2.addEdge("dist", "map");
		base2.print();		
	}

}
