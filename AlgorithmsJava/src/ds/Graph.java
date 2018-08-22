package ds;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph  {
	LinkedList nodes[];
	int num;
	//Number of nodes in the graph
	@SuppressWarnings("unchecked")
	public Graph(int num) {
		this.num = num;
		nodes = new LinkedList[num];	
		for(int i = 0; i < num ; i++){
			nodes[i] = new LinkedList<>();
		}
	}
	// Adds an edge to an undirected graph
	static void addEdge(Graph graph, int src, int dest)
	{
		// Add an edge from src to dest. 
		graph.nodes[src].addFirst(dest);

		// Since graph is undirected, add an edge from dest
		// to src also
		graph.nodes[dest].addFirst(src);
	}
	static void printGraph(Graph graph)
	{       
		for(int v = 0; v < graph.num; v++)
		{
			System.out.println("Adjacency list of vertex "+ v);
			System.out.print("head");
			for(Object pCrawl: graph.nodes[v]){
				System.out.print(" -> "+pCrawl);
			}
			System.out.println("\n");
		}
	}
	// A function used by DFS
	void DFSUtil(int v,boolean visited[])
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v+" ");

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = nodes[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v)
	{
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[num];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);
	}
	// Driver program to test above functions
	public static void main(String args[])
	{
		// create the graph given in above figure
		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);

		// print the adjacency list representation of 
		// the above graph
		printGraph(graph);
		graph.DFS(2);
	}
}
