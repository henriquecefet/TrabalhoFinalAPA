package Codigo;

public class Dijkstra {
	public static int[] primeiroDijkstra(Grafo grafo, int origem) {
		int[] distancias = new int[grafo.getNumeroDeVertices()];
		boolean[] visitados = new boolean[grafo.getNumeroDeVertices()];

		for (int i = 0; i < distancias.length; i++) {
			distancias[i] = Integer.MAX_VALUE;
		}
		distancias[origem] = 0;

		for (int i = 0; i < grafo.getNumeroDeVertices(); i++) {
			int verticeMaisProximo = -1;
			for (int j = 0; j < grafo.getNumeroDeVertices(); j++) {
				if (!visitados[j] && (verticeMaisProximo == -1 || distancias[j] < distancias[verticeMaisProximo])) {
					verticeMaisProximo = j;
				}
			}

			visitados[verticeMaisProximo] = true;

			ListaEncadeada<Grafo.Aresta> adjacencias = grafo.getAdjacencias(verticeMaisProximo);
			for (int j = 0; j < adjacencias.getTamanho(); j++) {
				Grafo.Aresta aresta = adjacencias.recuperar(j);
				int novoCaminho = distancias[verticeMaisProximo] + aresta.getPeso();
				if (novoCaminho < distancias[aresta.getDestino()]) {
					distancias[aresta.getDestino()] = novoCaminho;
				}
			}
		}

		return distancias;
	}

	public static int[] segundoDijkstra(Grafo grafo, int origem) {
		int[] distancias = new int[grafo.getNumeroDeVertices()];
		boolean[] visitados = new boolean[grafo.getNumeroDeVertices()];

		for (int i = 0; i < distancias.length; i++) {
			distancias[i] = Integer.MAX_VALUE;
		}
		distancias[origem] = 0;

		HeapBinario heap = new HeapBinario(grafo.getNumeroDeVertices());
		heap.adicionar(origem);

		while (heap.getTamanho() > 0) {
			int verticeMaisProximo = heap.remover();

			visitados[verticeMaisProximo] = true;

			ListaEncadeada<Grafo.Aresta> adjacencias = grafo.getAdjacencias(verticeMaisProximo);
			for (int i = 0; i < adjacencias.getTamanho(); i++) {
				Grafo.Aresta aresta = adjacencias.recuperar(i);
				int novoCaminho = distancias[verticeMaisProximo] + aresta.getPeso();
				if (novoCaminho < distancias[aresta.getDestino()]) {
					distancias[aresta.getDestino()] = novoCaminho;
					heap.adicionar(aresta.getDestino());
				}
			}
		}

		return distancias;
	}
}
