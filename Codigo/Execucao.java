package Codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Execucao {
	public static void main(String[] args) {
		boolean opcaoPrint = false;
		int opcaoAlgoritmo = 2; // 1 para o primeiro Dijkstra, 2 para o segundo.
		String opcaoArquivo = "src/DMXA/dmxa1801.STP";
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
		}

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

	public static double convertNanoToMilli(long nano) {
		return (double) nano / 1_000_000.0;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void testSet1fazerPrimeiroDijkstraPrint(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet1(arquivo);
		long inicio = System.nanoTime();

		int[] distancias = Dijkstra.primeiroDijkstra(grafo, 0);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do primeiroDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
		for (int i = 0; i < distancias.length; i++) {
			System.out.println("d["+i+"] = "+distancias[i]);
		}
	}

	public static void testSet1fazerPrimeiroDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet1(arquivo);
		long inicio = System.nanoTime();
		Dijkstra.segundoDijkstra(grafo, 0);
		long fim = System.nanoTime();
		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");

	}

	public static void testSet1fazerSegundoDijkstraPrint(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet1(arquivo);
		long inicio = System.nanoTime();

		Dijkstra.primeiroDijkstra(grafo, 0);
		long fim = System.nanoTime();
		int[] distancias = Dijkstra.segundoDijkstra(grafo, 0);
		System.out.println("Tempo de execução do primeiroDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
		for (int i = 0; i < distancias.length; i++) {
			System.out.println("d["+i+"] = "+distancias[i]);
		}
	}

	public static void testSet1fazerSegundoDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet1(arquivo);
		long inicio = System.nanoTime();

		Dijkstra.segundoDijkstra(grafo, 0);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void testSet2fazerPrimeiroDijkstraPrint(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet2(arquivo);
		long inicio = System.nanoTime();

		int[] distancias = Dijkstra.primeiroDijkstra(grafo, 0);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do primeiroDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
		for (int i = 0; i < distancias.length; i++) {
			System.out.println("d["+i+"] = "+distancias[i]);
		}
	}

	public static void testSet2fazerPrimeiroDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet2(arquivo);
		long inicio = System.nanoTime();
		Dijkstra.primeiroDijkstra(grafo, 0);
		long fim = System.nanoTime();
		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");

	}

	public static void testSe2fazerSegundoDijkstraPrint(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet2(arquivo);
		long inicio = System.nanoTime();

		int[] distancias = Dijkstra.segundoDijkstra(grafo, 0);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do primeiroDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
		for (int i = 0; i < distancias.length; i++) {
			System.out.println("d["+i+"] = "+distancias[i]);
		}
	}

	public static void testSet2fazerSegundoDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoTestSet2(arquivo);
		long inicio = System.nanoTime();

		Dijkstra.segundoDijkstra(grafo, 0);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void ALUEfazerPrimeiroDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoALUE(arquivo);
		long inicio = System.nanoTime();
		Dijkstra.primeiroDijkstra(grafo, 1);
		long fim = System.nanoTime();
		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}

	public static void ALUEfazerSegundoDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoALUE(arquivo);
		long inicio = System.nanoTime();

		Dijkstra.segundoDijkstra(grafo, 1);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void ALUTfazerPrimeiroDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoALUT(arquivo);
		long inicio = System.nanoTime();
		Dijkstra.primeiroDijkstra(grafo, 1);
		long fim = System.nanoTime();
		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}

	public static void ALUTfazerSegundoDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoALUT(arquivo);
		long inicio = System.nanoTime();

		Dijkstra.segundoDijkstra(grafo, 1);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void DMXAfazerPrimeiroDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoDMXA(arquivo);
		long inicio = System.nanoTime();
		Dijkstra.primeiroDijkstra(grafo, 1);
		long fim = System.nanoTime();
		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}

	public static void DMXAfazerSegundoDijkstraTempo(String arquivo) {
		Grafo grafo = lerGrafoDoArquivoDMXA(arquivo);
		long inicio = System.nanoTime();

		Dijkstra.segundoDijkstra(grafo, 1);
		long fim = System.nanoTime();

		System.out.println("Tempo de execução do segundoDijkstra: " + convertNanoToMilli(fim - inicio) + "ms");
	}
}