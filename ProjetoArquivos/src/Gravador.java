import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gravador {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao=0;
		try {
			// preciso manipular um arquivo (uso o objeto File)
			File f = new File("dados.txt");
			// vou manipular esse arquivo em modo escrita (no caso o parâmetro TRUE, indica APPEND - inserir no final)
			FileWriter fr = new FileWriter(f, true);
			// agora vou usar o mesmo cara do System.ou para imprimir neste arquivo
			PrintWriter pr = new PrintWriter(fr);
			
			Produto p;
			for (int i=1; i<=10; i++) {
				p = new Produto(i, "Produto"+i, i*100);
				System.out.println("Deseja gravar o produto de codigo "+i+ " (1 para sim e 0 para nao)");
				opcao = teclado.nextInt();
				if (opcao == 1) {
					pr.println(p);
				}			
			}
			pr.close();
			fr.close();
			System.out.println("Gravei tudao no arquivo");
		}
		catch (IOException ex) {
			System.out.println("Erro "+ex.getMessage());
		}		
		
		
		
		
		
		
	}
}
