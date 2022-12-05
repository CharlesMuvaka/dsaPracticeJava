import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dijskas {

    private Vertex source;
    private MatrixGraph graph;


    public void calculateShortestPath(Vertex start, MatrixGraph graph){
        this.source = start;
        this.graph = graph;
        Set<Vertex> settledVertices = new HashSet<>();
        //creating a queue for the unsettled vertices and adding the source.
        Queue<Vertex> unSettledVertices = new PriorityQueue<>(Collections.singleton(source));
        //set the distance of the source vertex to zero
        source.setDistance(0);

        while (!unSettledVertices.isEmpty()){
            Vertex currentVertex = unSettledVertices.poll();

            currentVertex.getAdjacentVertices().entrySet().stream().filter(vertexIntegerEntry -> !settledVertices.contains(vertexIntegerEntry.getKey()))
                            .forEach(vertexIntegerEntry -> {
                                int weight = graph.getAdjacencyMatrix()[currentVertex.getIndex()][vertexIntegerEntry.getKey().getIndex()];
                                evaluateDistanceAndPath(vertexIntegerEntry.getKey(),weight , currentVertex);
                                unSettledVertices.add(vertexIntegerEntry.getKey());
                            });
            settledVertices.add(currentVertex);
        }

    }

    private void evaluateDistanceAndPath(Vertex vertex, int weight, Vertex currentVertex) {
        Integer newDistance = currentVertex.getDistance() + weight;
        if (newDistance < vertex.getDistance()){
            vertex.setDistance(newDistance);
            vertex.setShortestPath(
                    Stream.concat(currentVertex.getShortestPath().stream(), Stream.of(currentVertex)).collect(Collectors.toList()));
        }
    }

    public List<Vertex> getShortestPath(){
        return source.getShortestPath();
    }
}
