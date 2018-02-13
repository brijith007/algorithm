package graphs;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

public class BFSTraversal<T> {
    void BFS(HashMap<T,LinkedList<T>> graph, T startNode){
    	HashSet<T> visitNodes= new HashSet<>();
    	LinkedList<T> queue= new LinkedList<>();
    	
    	queue.add(startNode);
    	visitNodes.add(startNode);
    	while(queue.size()!=0){
    		T node= queue.poll();
    		System.out.println(node);
    		LinkedList<T> adjNodes = graph.get(node);
    		if(adjNodes!=null){
    		 for(T adjNode: adjNodes){
    			 if(!visitNodes.contains(adjNode)){
    				 visitNodes.add(adjNode);
    				 queue.add(adjNode);
    			 }
    		 }
    		}
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph<Integer> a1 = new Graph<>();
		a1.addEdge(0, 3);
		a1.addEdge(1, 3);
		a1.addEdge(3, 4);
		a1.addEdge(2, 4);
		a1.addEdge(1, 2);
		a1.addEdge(0, 3);
		a1.addEdge(3, 1);
		//a1.addEdge(4, 2);
		BFSTraversal<Integer> exp1= new BFSTraversal<>();
		Integer a2= 0;
		exp1.BFS(a1.getMap(),a2);
	}

}
