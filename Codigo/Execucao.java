package Codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Execucao {
	public static void main(String[] args) {
		int opcaoAlgoritmo = 1; // 1 para o primeiro Dijkstra, 2 para o segundo.
		String opcaoArquivo = "test_set2/check_v5_s2.dat";

		boolean isTestSet_1 = opcaoArquivo.indexOf("test_set1") != -1 ? true : false;
		boolean isTestSet_2 = opcaoArquivo.indexOf("test_set2") != -1 ? true : false;
		boolean isALUE = opcaoArquivo.indexOf("ALUE") != -1 ? true : false;
		boolean isALUT = opcaoArquivo.indexOf("ALUT") != -1 ? true : false;
		boolean isDMXA = opcaoArquivo.indexOf("DMXA") != -1 ? true : false;

		if (isTestSet_1 || isTestSet_2) {
			testSetDijkstra(opcaoArquivo, opcaoAlgoritmo);
		} else if (isALUE || isALUT || isDMXA) {
			runDijkstra(opcaoArquivo, opcaoAlgoritmo);
		} else {
			System.out.println("Arquivo não encontrado.");
		}

	}

	// TestSet
	private static Grafo lerGrafoDoArquivoTestSet(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumeroNosTestSet(nomeDoArquivo);
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" 	 ");
					int origem = Integer.parseInt(partes[0]);
					int destino = Integer.parseInt(partes[1]);
					int peso = Integer.parseInt(partes[2].substring(0, partes[2].length() - 1));
					grafo.adicionarArestaTestSets(origem, destino, peso);
				} catch (Exception e) {
					continue;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return grafo;
	}

	private static Grafo lerNumeroNosTestSet(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" 		 ");
					if (partes[0].equals("NB_NODES")) {
						grafo = new Grafo(Integer.parseInt(partes[1]));
						return grafo;
					}
				} catch (Exception e) {
					continue;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return grafo;
	}

	private static Grafo lerGrafo(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumeros(nomeDoArquivo);
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" ");
					if (partes[0].equals("E")) {
						int origem = Integer.parseInt(partes[1]);
						int destino = Integer.parseInt(partes[2]);
						int peso = Integer.parseInt(partes[3]);
						grafo.adicionarAresta(origem, destino, peso);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return grafo;
	}

	private static Grafo lerNumeros(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" ");
					if (partes[0].equals("Nodes")) {
						grafo = new Grafo(Integer.parseInt(partes[1] + 1));
						return grafo;
					}
				} catch (Exception e) {
					continue;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return grafo;
	}

	public static void testSetDijkstra(String arquivo, int opcaoAlgoritmo) {
		Grafo grafo = lerGrafoDoArquivoTestSet(arquivo);
		int[] distancias = null;
		if (opcaoAlgoritmo == 1) {
			distancias = Dijkstra.dijkstraUtilizandoVetor(grafo, 0);
		} else {
			distancias = Dijkstra.dijkstraUtilizandoHeap(grafo, 0);
		}
		for (int i = 0; i < distancias.length; i++) {
			System.out.println("d[" + i + "] = " + distancias[i]);
		}
	}

	public static void runDijkstra(String arquivo, int opcaoAlgoritmo) {
		Grafo grafo = lerGrafo(arquivo);
		if (opcaoAlgoritmo == 1) {
			Dijkstra.dijkstraUtilizandoVetor(grafo, 1);
		} else {
			Dijkstra.dijkstraUtilizandoHeap(grafo, 1);
		}
	}

}