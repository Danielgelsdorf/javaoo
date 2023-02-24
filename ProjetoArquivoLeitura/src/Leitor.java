import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	public static void main(String[] args) {
		try {
			// vou precisar manipular o arquivo (por isso o objeto File)
			File f = new File("dados.txt");
			// esse arquivo tem que ser manipulado para Leitura (por isso o FileReader)
			FileReader fr = new FileReader(f);
			// quem efetivamente vai lê-lo linha a linha? o BufferedReader
			BufferedReader br = new BufferedReader(fr);
			String linha;
			do {
				linha = br.readLine();
				if (linha != null) {
					String infos[] = linha.split(";");
					int id = Integer.parseInt(infos[0]);
					String nome = infos[1];
					double preco = Double.parseDouble(infos[2]);					
					Produto p = new Produto(id, nome, preco);
					System.out.println(p);
				}
			} while (linha != null);
			br.close();
			fr.close();			
		}
		catch(IOException e) {
			System.out.println("ERRO - "+e.getMessage());
		
		}
	}

}
