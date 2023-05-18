package Codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		String[] arquivos = {"src/ALUT/alut0787.stp",
		            "src/ALUT/alut0805.stp",
		            "src/ALUT/alut1181.stp",
		            "src/ALUT/alut2010.stp",
		            "src/ALUT/alut2288.stp",
		            "src/ALUT/alut2566.stp",
		            "src/ALUT/alut2610.stp",
		            "src/ALUT/alut2625.stp",
		            "src/ALUT/alut2764.stp"};
		for(int i = 0; i < arquivos.length; i++) {
			lerNumeroNosDMXA(arquivos[i]);
		}
		
	}
	private static Grafo lerNumeroNosDMXA(String nomeDoArquivo) {
		Grafo grafo = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
			String linha;
			while ((linha = reader.readLine()) != null) {
				try {
					String[] partes = linha.split(" ");
					if (partes[0].equals("Nodes")) {
						System.out.println(partes[1] + 1);
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
