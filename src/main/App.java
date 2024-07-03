package main;

import main.Materia.Models.Node;
import main.Materia.Controllers.AVLTree;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.Graph;
import main.Materia.Controllers.Sets;
import main.Materia.Models.NodeG;

/*
 *                  1
 *       2                    3
 *    4           5                  6
 *7         8 
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRaiz = new Node(1);
        nodeRaiz.setLeft(new Node(2));
        nodeRaiz.setRight(new Node(3));

        nodeRaiz.getLeft().setLeft(new Node(4));
        nodeRaiz.getLeft().setRight(new Node(5));

        nodeRaiz.getRight().setRight(new Node(6));
        
        nodeRaiz.getLeft().getLeft().setLeft(new Node(7));
        nodeRaiz.getLeft().getRight().setLeft(new Node(8));
    
        System.out.println("Preorder");
        arbolBinario.preOrderLoop(nodeRaiz);

        System.out.println("\nPreOrder Recursivo" );
        arbolBinario.preOrderRecursivo(nodeRaiz);

        System.out.println("\nPostOrder");
        arbolBinario.postOrderLoop(nodeRaiz);

        System.out.println("\n PostOrder Recursivo");
        arbolBinario.postOrderRecursivo(nodeRaiz);

        System.out.println("\n In Order");
        arbolBinario.inOrderRecursivo(nodeRaiz);
        
        AVLTree tree = new AVLTree();

        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        for (int value : values) {
            tree.insert(value);
        }
        System.out.println(tree);

        runGraph();
        runSets();
        
    }

    private static void runGraph() {
        Graph grafo = new Graph();

        //NodeG node = new NodeG(1);
        //NodeG node2 = new NodeG(2);
        //NodeG node3 = new NodeG(4);
        //NodeG node4 = new NodeG(5);

        NodeG node1 = grafo.addNode(1);
        NodeG node2 = grafo.addNode(2);
        NodeG node3 = grafo.addNode(3);
        NodeG node4 = grafo.addNode(4);
        NodeG node5 = grafo.addNode(5);

        grafo.addEdge(node1, node2);
        grafo.addEdge(node1, node3);
        grafo.addEdge(node2, node4);
        grafo.addEdge(node4, node5);



        grafo.printGraph();


       
    }
    private static void runSets(){
        Sets variableClase =  new Sets();
    }
}
