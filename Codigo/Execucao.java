package Codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Execucao {
	public static void main(String[] args) {
		Grafo grafo = lerGrafoDoArquivoTestSet1("src/test_set2/check_v5_s2.DAT");
		// grafo.printGrafo();
		
		//Corretude
		long inicio = System.currentTimeMillis();

		int[] distancias = Dijkstra.primeiroDijkstra(grafo, 0); // Trocar para 1 quando for ALUE, ALUT ou DMXA
		long fim = System.currentTimeMillis();

		System.out.println("Tempo de execução do primeiroDijkstra: " + (fim - inicio) + "ms");
		for (int i = 0; i < distancias.length; i++) {
			System.out.println("Distância mínima do vértice " + i + " a partir da origem: " + distancias[i]);
		}

		System.out.println("---------------------------------------------------------------------------");
		inicio = System.currentTimeMillis();
		int[] distancias2 = Dijkstra.segundoDijkstra(grafo, 0); // Trocar para 1 quando for ALUE, ALUT ou DMXA
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução do segundoDijkstra: " + (fim - inicio) + "ms");
		for (int i = 0; i < distancias2.length; i++) {
			System.out.println("Distância mínima do vértice " + i + " a partir da origem: " + distancias2[i]);
		}
		
		//Otimo
		//ALUE
		Grafo grafo2 = lerGrafoDoArquivoALUE("src/ALUE/alue2087.STP");
		inicio = System.currentTimeMillis();

		int[] distancias3 = Dijkstra.primeiroDijkstra(grafo, 1); // Trocar para 1 quando for ALUE, ALUT ou DMXA
		fim = System.currentTimeMillis();

		System.out.println("ALUE: Tempo de execução do primeiroDijkstra: " + (fim - inicio) + "ms");

		
		inicio = System.currentTimeMillis();
		int[] distancias4 = Dijkstra.segundoDijkstra(grafo, 1); // Trocar para 1 quando for ALUE, ALUT ou DMXA
		fim = System.currentTimeMillis();
		System.out.println("ALUE: Tempo de execução do segundoDijkstra: " + (fim - inicio) + "ms");
		System.out.println("---------------------------------------------------------------------------");
		//ALUT
		Grafo grafo3 = lerGrafoDoArquivoALUT("src/ALUT/alut2610.STP");
		inicio = System.currentTimeMillis();

		int[] distancias5 = Dijkstra.primeiroDijkstra(grafo, 1); // Trocar para 1 quando for ALUE, ALUT ou DMXA
		fim = System.currentTimeMillis();

		System.out.println("ALUT: Tempo de execução do primeiroDijkstra: " + (fim - inicio) + "ms");

		inicio = System.currentTimeMillis();
		int[] distancias6 = Dijkstra.segundoDijkstra(grafo, 1); // Trocar para 1 quando for ALUE, ALUT ou DMXA
		fim = System.currentTimeMillis();
		System.out.println("ALUT: Tempo de execução do segundoDijkstra: " + (fim - inicio) + "ms");
	}

	// TestSet1
	// ----------------------------------------------------------------------
	private static Grafo lerGrafoDoArquivoTestSet1(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumeroNosTestSet1(nomeDoArquivo);
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

	private static Grafo lerNumeroNosTestSet1(String nomeDoArquivo) {
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

	// ALUE ----------------------------------------------------------------------
	private static Grafo lerGrafoDoArquivoALUE(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumeroNosALUE(nomeDoArquivo);
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" ");
					if (partes[0].equals("E")) {
						int origem = Integer.parseInt(partes[1]);
						int destino = Integer.parseInt(partes[2]);
						int peso = Integer.parseInt(partes[3]);
						grafo.adicionarArestaAlueAlutDmxa(origem, destino, peso);
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

	private static Grafo lerNumeroNosALUE(String nomeDoArquivo) {
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

	// ALUE ----------------------------------------------------------------------
	private static Grafo lerGrafoDoArquivoALUT(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumeroNosALUT(nomeDoArquivo);
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" ");
					if (partes[0].equals("E")) {
						int origem = Integer.parseInt(partes[1]);
						int destino = Integer.parseInt(partes[2]);
						int peso = Integer.parseInt(partes[3]);
						grafo.adicionarArestaAlueAlutDmxa(origem, destino, peso);
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

	private static Grafo lerNumeroNosALUT(String nomeDoArquivo) {
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

	// DMXA ----------------------------------------------------------------------
	private static Grafo lerGrafoDoArquivoDMXA(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumeroNosDMXA(nomeDoArquivo);
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" ");
					if (partes[0].equals("E")) {
						int origem = Integer.parseInt(partes[1]);
						int destino = Integer.parseInt(partes[2]);
						int peso = Integer.parseInt(partes[3]);
						grafo.adicionarArestaAlueAlutDmxa(origem, destino, peso);
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

	private static Grafo lerNumeroNosDMXA(String nomeDoArquivo) {
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

	// TestSet2
	// ----------------------------------------------------------------------
	private static Grafo lerGrafoDoArquivoTestSet2(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			grafo = lerNumeroNosTestSet2(nomeDoArquivo);
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

	private static Grafo lerNumeroNosTestSet2(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" 		 ");
					if (partes[0].equals("NB_NODES")) {
						grafo = new Grafo(Integer.parseInt(partes[1]));
						reader.close();
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
}