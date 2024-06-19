package main;

import main.Materia.Models.Node;
import main.Materia.Controllers.ArbolBinario;

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
    }
}
