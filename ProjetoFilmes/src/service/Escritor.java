package service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import core.Filme;

public class Escritor {
	public void gravarFilme(String nome, Filme filme) {
		try {
			File f = new File(nome);                  // manipulo o arquivo
			FileWriter fw = new FileWriter(f, true);  // acesso em modo escrita
			PrintWriter pw = new PrintWriter(fw);     // elemento que vai ainda gravar os dados
			pw.println(filme.toCSV());
			pw.close();
			fw.close();			
		}
		catch(IOException ex) {
			System.out.println("Erro ao gravar ");
			System.out.println(ex.getMessage());
		}
	}

}
