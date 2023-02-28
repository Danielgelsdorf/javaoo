package userinterface;

import java.util.ArrayList;
import java.util.Scanner;

import core.Filme;
import service.Escritor;
import service.Leitor;

public class Acervo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("================================");
			System.out.println("Acervo de filmes do Prof. Isidro");
			System.out.println("--------------------------------");
			System.out.println("Digite 1 - para cadastrar");
			System.out.println("Digite 2 - para exibir");
			System.out.println("Digite 3 - para buscar um filme");
			System.out.println("Digite 0 - para sair");
			System.out.print("Sua escolha:");
			opcao = Integer.parseInt(teclado.nextLine());
			switch (opcao) {
			case 1:
				Filme filme = new Filme();
				System.out.println("- Digite o nome do filme");
				filme.setNome(teclado.nextLine());
				System.out.println("- Digite o ano de lançamento");
				filme.setAno(Integer.parseInt(teclado.nextLine()));
				System.out.println("- Digite o genero");
				filme.setGenero(teclado.nextLine());
				System.out.println("- Digite a duração em minutos");
				filme.setDuracao(Integer.parseInt(teclado.nextLine()));
				System.out.println("- Digite a classificação (1 a 5)");
				filme.setClassificacao(Integer.parseInt(teclado.nextLine()));
				Escritor es = new Escritor();
				es.gravarFilme("filmes.txt", filme);
				break;
			case 2:
				System.out.println("-Seu acervo");
				System.out.println("-----------------------------");
				Leitor le = new Leitor();
				ArrayList<Filme> acervo = le.lerAcervo("filmes.txt");
				
				
				if (acervo != null) {
					for (Filme f : acervo) {
						System.out.println(f);
					}
				}
				break;
			case 3:
				System.out.println("- Digite a palavra chave");
				String palavraChave = teclado.nextLine();
				Leitor l = new Leitor();
				ArrayList<Filme> conjunto = l.lerAcervo("filmes.txt");
				for (Filme f: conjunto) {
					if (f.getNome().toUpperCase().contains(palavraChave.toUpperCase())) {
						System.out.println(f);
					}
				}
				break;
			case 0:
				System.out.println("Bye!");
				break;
			default:
				System.out.println("-Opcao Invalida!");
				break;
			}

		} while (opcao != 0);

		teclado.close();
	}
}
