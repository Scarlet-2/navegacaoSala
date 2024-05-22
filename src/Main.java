public class Main {
    public static void main(String[] args) {

//        Grafo grafo = new Grafo(5);
//        grafo.addNode(new Node("A"));
//        grafo.addNode(new Node("B"));
//        grafo.addNode(new Node("C"));
//        grafo.addNode(new Node("D"));
//        grafo.addNode(new Node("E"));
//
//        grafo.addConexao(0, 1);
//        grafo.addConexao(1, 2);
//        grafo.addConexao(2, 3);
//        grafo.addConexao(2, 4);
//        grafo.addConexao(4, 0);
//        grafo.addConexao(4, 2);
//
//        grafo.print();

        GrafoLista grafo = new GrafoLista();
        grafo.addNode(new Node("A"));
        grafo.addNode(new Node("B"));
        grafo.addNode(new Node("C"));
        grafo.addNode(new Node("D"));
        grafo.addNode(new Node("E"));

        grafo.addEdge(0, 1);
        grafo.addEdge(1, 2);
        grafo.addEdge(1, 4);
        grafo.addEdge(2, 3);
        grafo.addEdge(2, 4);
        grafo.addEdge(4, 0);
        grafo.addEdge(4, 2);

        grafo.print();
    }
}
