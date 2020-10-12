package minggu17;

import java.util.*;

public class Djikstra {
    LinkedList<Vertex> vertexes;
    LinkedList<Edge> edges;
    HashSet<Vertex> settledNodes;
    HashSet<Vertex> unsettledNodes;
    HashMap<Vertex, Vertex> predecessors;
    HashMap<Vertex, Integer> distance;

    public Djikstra(Graph graph){
        this.vertexes = new LinkedList<>(graph.vertexes);
        this.edges = new LinkedList<>(graph.edges);
    }
    
    private int getDistances(Vertex node, Vertex target){
        for (Edge edge : edges) {
            if (edge.source.equals(node) && edge.destination.equals(target)) {
                return edge.weight;
            }
        }
        return -1;
    }
    
    private boolean isSettled(Vertex vertex){
        return settledNodes.contains(vertex);
    }
    
    private LinkedList<Vertex> getNeighbors(Vertex node){
        LinkedList<Vertex> neighbors = new LinkedList<>();
        for (Edge edge : edges) {
            if (edge.source.equals(node) && !isSettled(edge.destination)) {
                neighbors.add(edge.destination);
            }
        }
        return neighbors;
    }
    
    private int getShortestDistance(Vertex destination){
        Integer d = distance.get(destination);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }
    
    private Vertex getMinimum(HashSet<Vertex> vertexes){
        Vertex minimum = null;
        for (Vertex vertex : vertexes) {
            if (minimum == null) {
                minimum = vertex;
            } else {
                if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
                    minimum = vertex;
                }
            }
        }
        return minimum;
    }
    
    private void findMinimalDistances(Vertex node){
        LinkedList<Vertex> adjacentNodes = getNeighbors(node);
        for (Vertex target : adjacentNodes) {
            if (getShortestDistance(target) > getShortestDistance(node) + getDistances(node, target)) {
                unsettledNodes.add(target);
            }
        }
    }
    
    public void execute(Vertex source){
        settledNodes = new HashSet<>();
        unsettledNodes = new HashSet<>();
        predecessors = new HashMap<>();
        distance = new HashMap<>();
        distance.put(source, 0);
        unsettledNodes.add(source);
        while (unsettledNodes.size() > 0){
            Vertex node = getMinimum(settledNodes);
            settledNodes.add(node);
            unsettledNodes.remove(node);
            findMinimalDistances(node);
        }
    }
    
    public LinkedList<Vertex> getPath(Vertex target){
        LinkedList<Vertex> path = new LinkedList<>();
        Vertex step = target;
        
        if (predecessors.get(step) != null) {
            return null;
        }
        path.add(step);
        while (predecessors.get(step) != null) {            
            step = predecessors.get(step);
            path.add(step);
        }
        
        Collections.reverse(path);
        return path;
    }
}
