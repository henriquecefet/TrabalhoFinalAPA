package Codigo;

//Classe que representa um grafo
public class Grafo {
	// Atributo que armazena as listas de adjacências de cada vértice do grafo
	private ListaEncadeada<Aresta>[] adjacencias;
	// Atributo que armazena o número de vértices do grafo
	private int numeroDeVertices;

	// Construtor que recebe o número de vértices e inicializa o vetor de listas de adjacências
	public Grafo(int numeroDeVertices) {
		this.numeroDeVertices = numeroDeVertices;
		this.adjacencias = new ListaEncadeada[numeroDeVertices];
		for (int i = 0; i < numeroDeVertices; i++) {
			this.adjacencias[i] = new ListaEncadeada<>();
		}
	}

	// Método que adiciona uma aresta direcionada e ponderada no grafo
	public void adicionarArestaTestSets(int origem, int destino, int peso) {
		this.adjacencias[origem].adicionar(new Aresta(destino, peso));
	}
	
	// Método que adiciona uma aresta não direcionada e ponderada no grafo
	public void adicionarArestaAlueAlutDmxa(int origem, int destino, int peso) {
		this.adjacencias[origem].adicionar(new Aresta(destino, peso));
		this.adjacencias[destino].adicionar(new Aresta(origem, peso));
	}

	// Método que retorna a lista de adjacências de um vértice do grafo
	public ListaEncadeada<Aresta> getAdjacencias(int vertice) {
		return this.adjacencias[vertice];
	}

	// Método que retorna o número de vértices do grafo
	public int getNumeroDeVertices() {
		return numeroDeVertices;
	}
	
	// Método que imprime o grafo na saída padrão
	public void printGrafo() {
		for(int i = 0; i< adjacencias.length; i++) {
			System.out.println("Vizinhos de "+i+":");
			for(int j = 0; j < adjacencias[i].getTamanho(); j++) {
				System.out.println(adjacencias[i].recuperar(j));
			}
			System.out.println("-------------------");
		}
	}
	
	// Método que retorna a quantidade de arestas do grafo
	public int getQuantidadeArestas() {
		int quantidadeArestas = 0;
		for(int i = 0; i< adjacencias.length; i++) {
			quantidadeArestas+=adjacencias[i].getTamanho();
		}
		return quantidadeArestas;
	}

 // Classe interna que representa uma aresta do grafo
	public static class Aresta {
	    // Atributos que armazenam o vértice destino e o peso da aresta
		private int destino;
		private int peso;

     // Construtor que recebe o destino e o peso da aresta
		public Aresta(int destino, int peso) {
			this.destino = destino;
			this.peso = peso;
		}

     // Método que retorna o destino da aresta
		public int getDestino() {
			return destino;
		}

     // Método que altera o destino da aresta
		public void setDestino(int destino) {
			this.destino = destino;
		}

     // Método que retorna o peso da aresta
		public int getPeso() {
			return peso;
		}

     // Método que altera o peso da aresta
		public void setPeso(int peso) {
			this.peso = peso;
		}
     
	}
}