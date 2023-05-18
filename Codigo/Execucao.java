package Codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Execucao {
	public static void main(String[] args) {
<<<<<<< HEAD
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
=======
		boolean opcaoPrint = false;
		int opcaoAlgoritmo = 2; // 1 para o primeiro Dijkstra, 2 para o segundo.
		String opcaoArquivo = "src/test_set2/inst_v1000_s2.DAT";
		if (opcaoPrint) {
			if (opcaoAlgoritmo == 1) {
				switch (opcaoArquivo) {
				case "src/test_set1/check_v5_s1.DAT":
					testSet1fazerPrimeiroDijkstraPrint(opcaoArquivo);
					break;
				case "src/test_set2/check_v5_s2.DAT":
					testSet2fazerPrimeiroDijkstraPrint(opcaoArquivo);
					break;
				}

			} else {
				switch (opcaoArquivo) {
				case "src/test_set1/check_v5_s1.DAT":
					testSet1fazerPrimeiroDijkstraPrint(opcaoArquivo);
					break;
				case "src/test_set2/check_v5_s2.DAT":
					testSet2fazerPrimeiroDijkstraPrint(opcaoArquivo);
					break;
				}

			}
		} else {
			if (opcaoAlgoritmo == 1) {
				switch (opcaoArquivo) {
				case "src/test_set1/check_v5_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v100_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v200_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v300_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v400_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v500_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v600_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v700_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v800_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v900_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v1000_s1.DAT":
					testSet1fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/check_v5_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v100_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v200_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v300_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v400_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v500_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v600_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v700_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v800_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v900_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v1000_s2.DAT":
					testSet2fazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				// ALUE
				case "src/ALUE/alue2087.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue2105.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue3146.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5067.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5345.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5623.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5901.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6179.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6457.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6735.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6951.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7065.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7066.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7080.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7229.STP":
					ALUEfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				// ALUT
				case "src/ALUT/alut2764.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2625.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2566.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2288.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2010.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut1181.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut0805.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut0787.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2610.STP":
					ALUTfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				// DXMA
				case "src/DMXA/dmxa0296.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0368.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0454.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0628.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0734.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0848.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0903.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1010.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1109.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1200.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1304.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1516.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1721.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1801.STP":
					DMXAfazerPrimeiroDijkstraTempo(opcaoArquivo);
					break;
				}
			} else {
				switch (opcaoArquivo) {
				case "src/test_set1/check_v5_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v100_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v200_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v300_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v400_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v500_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v600_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v700_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v800_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v900_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set1/inst_v1000_s1.DAT":
					testSet1fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/check_v5_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v100_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v200_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v300_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v400_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v500_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v600_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v700_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v800_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v900_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/test_set2/inst_v1000_s2.DAT":
					testSet2fazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				// ALUE
				case "src/ALUE/alue2087.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue2105.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue3146.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5067.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5345.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5623.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue5901.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6179.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6457.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6735.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue6951.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7065.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7066.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7080.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUE/alue7229.STP":
					ALUEfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				// ALUT
				case "src/ALUT/alut2764.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2625.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2566.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2288.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2010.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut1181.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut0805.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut0787.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/ALUT/alut2610.STP":
					ALUTfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				// DXMA
				case "src/DMXA/dmxa0296.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0368.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0454.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0628.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0734.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0848.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa0903.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1010.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1109.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1200.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1304.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1516.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1721.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;
				case "src/DMXA/dmxa1801.STP":
					DMXAfazerSegundoDijkstraTempo(opcaoArquivo);
					break;

				}

			}
>>>>>>> main
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
			distancias = Dijkstra.primeiroDijkstra(grafo, 0);
		} else {
			distancias = Dijkstra.segundoDijkstra(grafo, 0);
		}
		for (int i = 0; i < distancias.length; i++) {
			System.out.println("d[" + i + "] = " + distancias[i]);
		}
	}

	public static void runDijkstra(String arquivo, int opcaoAlgoritmo) {
		Grafo grafo = lerGrafo(arquivo);
		if (opcaoAlgoritmo == 1) {
			Dijkstra.primeiroDijkstra(grafo, 1);
		} else {
			Dijkstra.segundoDijkstra(grafo, 1);
		}
	}

}