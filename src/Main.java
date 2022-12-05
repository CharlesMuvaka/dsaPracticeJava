import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    int verticesNumber;
    ArrayList[] adjList;

    public Main(int verticesNumber) {
        this.verticesNumber = verticesNumber;
        this.adjList = new ArrayList[verticesNumber];
        for (int i = 0; i< verticesNumber; i++){
            adjList[i] = new ArrayList<>();
        }
    }

    public void addNeighbors(int vertex, int neighbor){
        adjList[vertex].add(neighbor);
    }

    public void depthFirstTraversal(int source){
        List<Integer> vertices = new ArrayList<>();
        vertices.add(source);
        boolean[] visited = new boolean[verticesNumber];
        visited[source] = true;
        while (vertices.size() > 0){
            source = vertices.remove(0);
            System.out.println(source);
            Iterator i = adjList[source].iterator();
            while (i.hasNext()){
                int n = (int) i.next();
                if (!visited[n]){
                    visited[n] = true;
                    vertices.add(n);
                }
            }




        }
    }

    public static void main(String[] args) {
        MatrixGraph graph = new MatrixGraph(6);
        Vertex zero = new Vertex(0, 0.5);
        Vertex one = new Vertex(1, 0.3);
        Vertex two = new Vertex(2, 0.2);
        Vertex three = new Vertex(3, 0.1);
        Vertex four = new Vertex(4, 0.9);
        Vertex five = new Vertex(5, 0.7);

        zero.setAdjacentVertices(one,1);
        zero.setAdjacentVertices(two,1);

        one.setAdjacentVertices(zero,1);
        one.setAdjacentVertices(two,1);
        one.setAdjacentVertices(three,1);

        two.setAdjacentVertices(zero,1);
        two.setAdjacentVertices(one,1);
        two.setAdjacentVertices(four,1);

        three.setAdjacentVertices(one,1);
        three.setAdjacentVertices(two,1);
        three.setAdjacentVertices(four,1);
        three.setAdjacentVertices(five,1);

        four.setAdjacentVertices(one,2);
        four.setAdjacentVertices(two,3);
        four.setAdjacentVertices(three,4);
        four.setAdjacentVertices(five,5);

        five.setAdjacentVertices(three,5);
        four.setAdjacentVertices(four,7);

        //first row
        graph.addEdgeWeight(zero,zero, 0);
        graph.addEdgeWeight(zero,one, 1);
        graph.addEdgeWeight(zero,two, 4);
        graph.addEdgeWeight(zero,three, 0);
        graph.addEdgeWeight(zero,four, 0);
        graph.addEdgeWeight(zero,five, 0);

        //second row
        graph.addEdgeWeight(one,one, 0);
        graph.addEdgeWeight(one,two, 4);
        graph.addEdgeWeight(one,three, 2);
        graph.addEdgeWeight(one,four, 7);
        graph.addEdgeWeight(one,five, 0);

        //third row
        graph.addEdgeWeight(two,two, 0);
        graph.addEdgeWeight(two,three, 3);
        graph.addEdgeWeight(two,four, 5);
        graph.addEdgeWeight(two,five, 0);

        //fourth row
        graph.addEdgeWeight(three,three, 0);
        graph.addEdgeWeight(three,four, 4);
        graph.addEdgeWeight(three,five, 6);

        //fifth row
        graph.addEdgeWeight(four,four, 0);
        graph.addEdgeWeight(four,five, 7);

        //sixth row
        graph.addEdgeWeight(five,five, 0);

        Calc calc = new Calc();
        Calc.calculateShortestDist(graph.getAdjacencyMatrix());





    }
}