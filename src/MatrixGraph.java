import java.util.HashMap;
import java.util.Map;

public class MatrixGraph {
    private int[][] adjacencyMatrix;
    private int vertices;

    public MatrixGraph(int no_of_vertices){
        this.vertices = no_of_vertices;
        this.adjacencyMatrix = new int[no_of_vertices][no_of_vertices];
    }

    public void addEdgeWeight(Vertex i, Vertex j, int weight){

//        Map<Integer,Double> verticesCost = new HashMap<>();
//        verticesCost.put(0, 0.5);
//        verticesCost.put(1, 0.3);
//        verticesCost.put(2, 0.2);
//        verticesCost.put(3, 0.1);
//        verticesCost.put(4, 0.9);
//        verticesCost.put(5, 0.7);

        double cost1 = i.getCost();
        double cost2 = j.getCost();

        this.adjacencyMatrix[i.getIndex()][j.getIndex()] = (int) (weight / (cost1*cost2));
        this.adjacencyMatrix[j.getIndex()][i.getIndex()] = (int) (weight / (cost1*cost2));
    }



    public void displayGraph(){
        for (int i = 0; i < this.adjacencyMatrix.length; i++) {
            for (int j = 0; j < this.adjacencyMatrix[i].length; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }


}
