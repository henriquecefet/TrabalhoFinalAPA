package Codigo;


public class Principal {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(6);
        grafo.adicionarAresta(0, 1, 7);
        grafo.adicionarAresta(0, 2, 9);
        grafo.adicionarAresta(0, 5, 14);
        grafo.adicionarAresta(1, 2, 10);
        grafo.adicionarAresta(1, 3, 15);
        grafo.adicionarAresta(2, 3, 11);
        grafo.adicionarAresta(2, 5, 2);
        grafo.adicionarAresta(3, 4, 6);
        grafo.adicionarAresta(4, 5, 9);

        int[] distancias = Dijkstra.primeiroDijkstra(grafo, 0);

        for (int i = 0; i < distancias.length; i++) {
            System.out.println("Distância mínima do vértice " + i + " a partir da origem: " + distancias[i]);
        }
        
        System.out.println("-----");
        
        int[] distancias2 = Dijkstra.segundoDijkstra(grafo, 0);
        for (int i = 0; i < distancias2.length; i++) {
            System.out.println("Distância mínima do vértice " + i + " a partir da origem: " + distancias2[i]);
        }
    }
}
