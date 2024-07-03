package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import main.Materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;

    public Graph(){
        this.nodes = new ArrayList<>();
    }

    public NodeG addNode(int value){
        NodeG newNode = new NodeG(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(NodeG src, NodeG dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void printGraph(){
        for(NodeG node: nodes){
            System.out.println("Vertex " + node.getValue() + ":");
            for(NodeG neighbor : node.getNeighbors()){
                System.out.println("-> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    public void getDFS(NodeG startNode){
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNode, visited);
    }

    private void getDFSUtil(NodeG node, boolean[] visited){
        if (node == null) return;

        int index = nodes.indexOf(node);
        if (visited[index]) return;

        visited[index] = true;
        System.out.print(node.getValue() + " ");

        for (NodeG neighbor : node.getNeighbors()){
            getDFSUtil(neighbor, visited);
        }
    }

    public void getBFS(NodeG startNode){
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodeG> queue = new LinkedList<>();
        
        visited[nodes.indexOf(startNode)] = true;
        queue.add(startNode);

        while (!queue.isEmpty()){
            NodeG node = queue.poll();
            System.out.print(node.getValue() + " ");

            for (NodeG neighbor : node.getNeighbors()){
                int index = nodes.indexOf(neighbor);
                if (!visited[index]){
                    visited[index] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix(){
        int size = nodes.size();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++){
            NodeG node = nodes.get(i);
            for (NodeG neighbor : node.getNeighbors()){
                int neighborIndex = nodes.indexOf(neighbor);
                matrix[i][neighborIndex] = 1;
            }
        }
        return matrix;
    }

    public void printAdjacencyMatrix(){
        int[][] matrix = getAdjacencyMatrix();
        int size = matrix.length;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
