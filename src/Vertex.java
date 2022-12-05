import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Vertex {
    private int index;
    private double cost;
    private int distance = Integer.MAX_VALUE;
    private List<Vertex> shortestPath = new LinkedList<>();
    Map<Vertex, Integer> adjacentVertices = new HashMap<>();

    public Vertex(int index, double cost) {
        this.index = index;
        this.cost = cost;
    }

    public void setAdjacentVertices(Vertex vertex, int weight){
        adjacentVertices.put(vertex, weight);
    }

    public int compareTo(Vertex vertex){
        return Integer.compare(this.distance, vertex.distance);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public List<Vertex> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Vertex> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Map<Vertex, Integer> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void setAdjacentVertices(Map<Vertex, Integer> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }
}
