package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import core.Filme;

public class Leitor {
	public ArrayList<Filme> lerAcervo(String nome){
		try {
			ArrayList<Filme> lista = new ArrayList<Filme>();
			File f = new File(nome);                      // manipulo o arquivo
			FileReader fr = new FileReader(f);			  // abro este arquivo em modo "leitura"
			BufferedReader br = new BufferedReader(fr);   // quem efetivamente vai le-lo linha a linha
			String linha;
			do {
				linha = br.readLine();				
				if (linha != null) {
					String dados[] = linha.split(";");
					Filme filme = new Filme();
					filme.setNome(dados[0]);
					filme.setAno(Integer.parseInt(dados[1]));
					filme.setGenero(dados[2]);
					filme.setDuracao(Integer.parseInt(dados[3]));
					filme.setClassificacao(Integer.parseInt(dados[4]));
					lista.add(filme);
					
				}				
			} while (linha != null);
			br.close();
			fr.close();
			return lista;
		}
		catch(IOException ex) {
			System.out.println("Erro ao ler o arquivo");
			System.out.println(ex.getMessage());
		}
		return null;
	}
}
