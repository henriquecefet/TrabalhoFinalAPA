package Codigo;

//Classe que implementa o algoritmo de Dijkstra para encontrar o menor caminho entre dois vértices de um grafo
public class Dijkstra {
	// Método que retorna um vetor com as distâncias mínimas entre o vértice origem e todos os outros vértices do grafo
	// Este método usa uma abordagem simples de percorrer todos os vértices não visitados e escolher o mais próximo da 

	//O método primeiroDijkstra tem dois laços aninhados: um que percorre todos os vértices não visitados (V vezes) 
	//e outro que percorre todas as arestas adjacentes ao vértice mais próximo (no máximo E vezes). 
	//Portanto, a complexidade desse método é O(V*E).


	public static int[] primeiroDijkstra(Grafo grafo, int origem) {
		// Cria um vetor para armazenar as distâncias mínimas
		int[] distancias = new int[grafo.getNumeroDeVertices()];
		// Cria um vetor para marcar os vértices já visitados
		boolean[] visitados = new boolean[grafo.getNumeroDeVertices()];

		// Inicializa as distâncias com um valor infinito, exceto a origem que tem distância zero
		for (int i = 0; i < distancias.length; i++) {
			distancias[i] = Integer.MAX_VALUE;
		}
		distancias[origem] = 0;

		// Repete o processo até que todos os vértices sejam visitados
		for (int i = 0; i < grafo.getNumeroDeVertices(); i++) {
			// Define uma variável para armazenar o índice do vértice mais próximo da origem
			int verticeMaisProximo = -1;
			// Percorre todos os vértices não visitados e verifica qual tem a menor distância da origem
			for (int j = 0; j < grafo.getNumeroDeVertices(); j++) {
				if (!visitados[j] && (verticeMaisProximo == -1 || distancias[j] < distancias[verticeMaisProximo])) {
					verticeMaisProximo = j;
				}
			}

			// Marca o vértice mais próximo como visitado
			visitados[verticeMaisProximo] = true;

			// Obtém a lista de adjacências do vértice mais próximo
			ListaEncadeada<Grafo.Aresta> adjacencias = grafo.getAdjacencias(verticeMaisProximo);
			// Percorre todas as arestas adjacentes e verifica se há um caminho mais curto através delas
			for (int j = 0; j < adjacencias.getTamanho(); j++) {
				Grafo.Aresta aresta = adjacencias.recuperar(j);
				int novoCaminho = distancias[verticeMaisProximo] + aresta.getPeso();
				if (novoCaminho < distancias[aresta.getDestino()]) {
					distancias[aresta.getDestino()] = novoCaminho;
				}
			}
		}

		// Retorna o vetor de distâncias mínimas
		return distancias;
	}

	// Método que retorna um vetor com as distâncias mínimas entre o vértice origem e todos os outros vértices do grafo
	// Este método usa uma abordagem mais eficiente de usar uma heap binária para armazenar os vértices não visitados e extrair o mais próximo da origem

	// Esse algoritmo tem uma complexidade de tempo de O(E log V) pois percorre todas as arestas e para cada arestas adiciona
	// ou remove um vértice na heap binária, que como demostrado na outra classe, tem operações O(log n).
	public static int[] segundoDijkstra(Grafo grafo, int origem) {
	    // Cria um vetor para armazenar as distâncias mínimas
	    int[] distancias = new int[grafo.getNumeroDeVertices()];
	    // Cria um vetor para marcar os vértices já visitados
	    boolean[] visitados = new boolean[grafo.getNumeroDeVertices()];

	    // Inicializa as distâncias com um valor infinito, exceto a origem que tem distância zero
	    for (int i = 0; i < distancias.length; i++) {
	        distancias[i] = Integer.MAX_VALUE;
	    }
	    distancias[origem] = 0;

	    // Cria uma heap binária para armazenar os vértices não visitados
	    HeapBinario heap = new HeapBinario(grafo.getQuantidadeArestas());
	    // Adiciona o vértice origem na heap
	    heap.adicionar(origem);

	    // Repete o processo até que a heap esteja vazia
	    while (heap.getTamanho() > 0) {
	        // Extrai o vértice mais próximo da origem da heap
	        int verticeMaisProximo = heap.remover();

	        // Marca o vértice mais próximo como visitado
	        visitados[verticeMaisProximo] = true;

	        // Obtém a lista de adjacências do vértice mais próximo
	        ListaEncadeada<Grafo.Aresta> adjacencias = grafo.getAdjacencias(verticeMaisProximo);
	        // Percorre todas as arestas adjacentes e verifica se há um caminho mais curto através delas
	        for (int i = 0; i < adjacencias.getTamanho(); i++) {
	            Grafo.Aresta aresta = adjacencias.recuperar(i);
	            int novoCaminho = distancias[verticeMaisProximo] + aresta.getPeso();
	            if (novoCaminho < distancias[aresta.getDestino()]) {
	                distancias[aresta.getDestino()] = novoCaminho;
	                // Adiciona o vértice destino na heap, se ainda não foi visitado
	                if (!visitados[aresta.getDestino()]) {
	                    heap.adicionar(aresta.getDestino());
	                }
	            }
	        }
	    }

	    // Retorna o vetor de distâncias mínimas
	    return distancias;
	}
}