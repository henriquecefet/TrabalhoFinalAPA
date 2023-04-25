package Codigo;

public class Grafo {
	private ListaEncadeada<Aresta>[] adjacencias;
	private int numeroDeVertices;

	public Grafo(int numeroDeVertices) {
		this.numeroDeVertices = numeroDeVertices;
		this.adjacencias = new ListaEncadeada[numeroDeVertices];
		for (int i = 0; i < numeroDeVertices; i++) {
			this.adjacencias[i] = new ListaEncadeada<>();
		}
	}

	public void adicionarAresta(int origem, int destino, int peso) {
		this.adjacencias[origem].adicionar(new Aresta(destino, peso));
	}

	public ListaEncadeada<Aresta> getAdjacencias(int vertice) {
		return this.adjacencias[vertice];
	}

	public int getNumeroDeVertices() {
		return numeroDeVertices;
	}
	
	public void printGrafo() {
		for(int i = 0; i< adjacencias.length; i++) {
			System.out.println("Vizinhos de "+i+":");
			for(int j = 0; j < adjacencias[i].getTamanho(); j++) {
				System.out.println(adjacencias[i].recuperar(j));
			}
			System.out.println("-------------------");
		}
	}

	public static class Aresta {
		private int destino;
		private int peso;

		public Aresta(int destino, int peso) {
			this.destino = destino;
			this.peso = peso;
		}

		public int getDestino() {
			return destino;
		}

		public void setDestino(int destino) {
			this.destino = destino;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}
	}
}
