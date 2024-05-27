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

        Grafo grafo = new Grafo(14);
        grafo.addNode(new Node("P1"));
        grafo.addNode(new Node("P2"));
        grafo.addNode(new Node("P3"));
        grafo.addNode(new Node("P4"));
        grafo.addNode(new Node("P5"));
        grafo.addNode(new Node("P6"));
        grafo.addNode(new Node("P7"));
        grafo.addNode(new Node("P8"));
        grafo.addNode(new Node("P9"));
        grafo.addNode(new Node("P10"));
        grafo.addNode(new Node("P11"));
        grafo.addNode(new Node("P12"));
        grafo.addNode(new Node("P13"));
        grafo.addNode(new Node("P14"));

        // P1
        grafo.addConexao(0, 1);
        grafo.addConexao(0, 2);
        grafo.addConexao(0, 3);

        // P2
        grafo.addConexao(1, 0);
        grafo.addConexao(1, 13);

        // P3
        grafo.addConexao(2, 0);
        grafo.addConexao(2, 9);

        // P4
        grafo.addConexao(3, 0);
        grafo.addConexao(3, 4);
        grafo.addConexao(3, 11);

        // P5
        grafo.addConexao(4, 7);
        grafo.addConexao(4, 5);
        grafo.addConexao(4, 6);
        grafo.addConexao(4, 3);

        // P6
        grafo.addConexao(5, 4);
        grafo.addConexao(5, 10);

        // P7
        grafo.addConexao(6, 4);
        grafo.addConexao(6, 8);

        // P8
        grafo.addConexao(7, 4);
        grafo.addConexao(7, 12);

        // P9
        grafo.addConexao(8, 6);

        // P10
        grafo.addConexao(9, 2);

        // P11
        grafo.addConexao(10, 5);

        // P12
        grafo.addConexao(11, 3);

        // P13
        grafo.addConexao(12, 7);

        // P14
        grafo.addConexao(13, 1);

//        grafo.print();

        // Demonstração!
        grafo.depthSearch(0, 1);
    }
}
