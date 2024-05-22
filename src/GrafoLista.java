import java.util.ArrayList;
import java.util.LinkedList;

public class GrafoLista {

    ArrayList<LinkedList<Node>> grafoLista;

    public GrafoLista() {
        grafoLista = new ArrayList<>();
    }

    public void addNode(Node n){
        LinkedList<Node> current = new LinkedList<>();
        current.add(n);
        grafoLista.add(current);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> current = grafoLista.get(src);
        Node dstNode = grafoLista.get(dst).get(0);
        current.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> current = grafoLista.get(src);
        Node dstNode = grafoLista.get(dst).get(0);

        for(Node node : current){
            if(node == dstNode) {
                return true;
            }
        }

        return false;
    }

    public void print() {
        for(LinkedList<Node> currentList : grafoLista) {
            for(Node node : currentList) {
                System.out.print(node.valor + " -> ");
            }
            System.out.println();
        }
    }

}
