package Codigo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Execucao {
    public static void main(String[] args) {
        Grafo grafo = lerGrafoDoArquivo("src/check_v5_s1.txt");

        long inicio = System.currentTimeMillis();
        int[] distancias = Dijkstra.primeiroDijkstra(grafo, 0);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do primeiroDijkstra: " + (fim - inicio) + "ms");   
        for (int i = 0; i < distancias.length; i++) {
            System.out.println("Distância mínima do vértice " + i + " a partir da origem: " + distancias[i]);
        }
        System.out.println("---------------------------------------------------------------------------");
        inicio = System.currentTimeMillis();
        int[] distancias2 = Dijkstra.segundoDijkstra(grafo, 0);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do segundoDijkstra: " + (fim - inicio) + "ms");
        for (int i = 0; i < distancias2.length; i++) {
            System.out.println("Distância mínima do vértice " + i + " a partir da origem: " + distancias2[i]);
        }
    }

    private static Grafo lerGrafoDoArquivo(String nomeDoArquivo) {
        Grafo grafo = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
           // int numeroDeVertices = Integer.parseInt(reader.readLine());
        	int numeroDeVertices = 5;
            grafo = new Grafo(numeroDeVertices);
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(" ");
                int origem = Integer.parseInt(partes[0]);
                int destino = Integer.parseInt(partes[1]);
                int peso = Integer.parseInt(partes[2]);
                grafo.adicionarAresta(origem, destino, peso);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return grafo;
    }
}