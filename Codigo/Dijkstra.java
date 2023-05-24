package Codigo;

public class Dijkstra {

	public static double convertNanoToMilli(long nano) {
		return (double) nano / 1_000_000.0;
	}

	public static int[] dijkstraUtilizandoVetor(Grafo grafo, int origem) {
		// Implementacao do algoritmo de Dijkstra utilizando vetor

		long inicio = System.nanoTime();

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

		long fim = System.nanoTime();
		System.out.println(
				"[dijkstraUtilizandoVetor] Tempo de execução do dijkstraUtilizandoVetor: "
						+ convertNanoToMilli(fim - inicio)
						+ "ms");

		return distancias;
	}

	public static int[] dijkstraUtilizandoHeap(Grafo grafo, int origem) {
		// Implementação do algoritmo de Dijkstra usando Heap Binário

		long inicio = System.nanoTime();

		int[] distancias = new int[grafo.getNumeroDeVertices()];
		boolean[] visitados = new boolean[grafo.getNumeroDeVertices()];

		for (int i = 0; i < distancias.length; i++) {
			distancias[i] = Integer.MAX_VALUE;
		}
		distancias[origem] = 0;

		HeapBinario heap = new HeapBinario(grafo.getQuantidadeArestas());
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

		long fim = System.nanoTime();
		System.out.println(
				"[dijkstraUtilizandoHeap] Tempo de execução do dijkstraUtilizandoHeap: "
						+ convertNanoToMilli(fim - inicio)
						+ "ms");

		return distancias;
	}
}
