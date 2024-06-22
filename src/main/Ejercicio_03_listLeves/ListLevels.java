package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListLevels {

    public ListLevels(Object object) {
        //TODO Auto-generated constructor stub
    }

    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        listLevelsHelper(root, 0, result);
        return result;
    }

    private void listLevelsHelper(Node node, int level, List<List<Node>> result) {
        if (node == null) {
            return;
        }

        if (result.size() == level) {
            result.add(new LinkedList<>());
        }

        result.get(level).add(node);

        listLevelsHelper(node.getLeft(), level + 1, result);
        listLevelsHelper(node.getRight(), level + 1, result);
    }
}
