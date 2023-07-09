package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import src.algorithms.Dijkstra;

public class Main {
	public static String opcaoArquivo = "grafos/test_set2/check_v5_s2.dat";
	public static int opcaoAlgoritmo = 2; // 1 = Vetor | 2 = Heap
	public static int origem = 0; // Sempre queremos começar do vértice 0

	public static double convertNanoToMilli(long nano) {
		return (double) nano / 1_000_000.0;
	}

	public static void main(String[] args) {

		File f = new File(opcaoArquivo);
		if (!f.exists() && !f.isDirectory()) {
			System.out.println("Arquivo não encontrado.");
			return;
		}

		boolean isTestSet_1 = opcaoArquivo.indexOf("test_set1") != -1 ? true : false;
		boolean isTestSet_2 = opcaoArquivo.indexOf("test_set2") != -1 ? true : false;
		boolean isALUE = opcaoArquivo.indexOf("ALUE") != -1 ? true : false;
		boolean isALUT = opcaoArquivo.indexOf("ALUT") != -1 ? true : false;
		boolean isDMXA = opcaoArquivo.indexOf("DMXA") != -1 ? true : false;

		Grafo grafo;
		if (isTestSet_1 || isTestSet_2) {
			grafo = lerGrafoTestSet(opcaoArquivo);
		} else if (isALUE || isALUT || isDMXA) {
			grafo = lerGrafo(opcaoArquivo);
		} else {
			System.out.println("Tipo de Grafo não reconhecido.");
			return;
		}
		runDijkstra(grafo, opcaoAlgoritmo, origem);
	}

	private static Grafo lerGrafoTestSet(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumerosTestSet(nomeDoArquivo);
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

	private static Grafo lerNumerosTestSet(String nomeDoArquivo) {
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
						int origem = Integer.parseInt(partes[1]) - 1;
						int destino = Integer.parseInt(partes[2]) - 1;
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

	public static void runDijkstra(Grafo grafo, int opcaoAlgoritmo, int origem) {
		int[] distancias = null;

		long inicio = System.nanoTime();
		if (opcaoAlgoritmo == 1) {
			distancias = Dijkstra.dijkstraUtilizandoVetor(grafo, origem);
		} else {
			distancias = Dijkstra.dijkstraUtilizandoHeap(grafo, origem);
		}
		long fim = System.nanoTime();

		for (int i = 0; i < distancias.length; i++) {
			System.out.println("d[" + i + "] = " + distancias[i]);
		}

		System.out.println("********* Resultados *********");
		System.out.println("Arquivo: " + opcaoArquivo);
		System.out.println("Tempo total: " + convertNanoToMilli(fim - inicio) + "ms");
		System.out.println("Estrutura utilizada: " + (opcaoAlgoritmo == 1 ? "vetor" : "heap"));

	}

}