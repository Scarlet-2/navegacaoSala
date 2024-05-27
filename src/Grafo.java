
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

    public void depthSearch(int inicial, int alvo) {
        boolean[] visitado = new boolean[matrix.length];
        depthHelper(inicial, visitado, alvo);
    }

    private void depthHelper(int inicial, boolean[] visitado, int alvo) {
        if(visitado[inicial]) {
            return;
        } else {
            visitado[inicial] = true;
            System.out.println(nodes.get(inicial).valor + " = visitado");
        }

        for(int i = 0; i < matrix[inicial].length; i++) {
            if(matrix[inicial][i] == 1) {
                depthHelper(i, visitado, alvo);
            }
            if(visitado[alvo]) {
                System.out.println("Chegou no destino!");
                break;
            }
        }

    }

}
