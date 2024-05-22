
import java.util.*;

public class Grafo {

    ArrayList<Node> nodes;
    int[][] matrix;

    public Grafo(int tamanho) {
        nodes = new ArrayList<>();
        matrix = new int[tamanho][tamanho];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addConexao(int inicial, int fim) {
        matrix[inicial][fim] = 1;
    }

    public boolean verificarConexao(int inicial, int fim) {
        if(matrix[inicial][fim] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.valor + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).valor + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
