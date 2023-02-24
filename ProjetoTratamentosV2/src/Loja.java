import java.util.Scanner;

public class Loja {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String strId, nome, strPreco;
		int id;
		double preco;
		boolean deuBom = false;
		Produto p = new Produto();

		do {
			try {

				System.out.println("Digite o codigo do produto");
				strId = teclado.nextLine();
				id = Integer.parseInt(strId);

				p.setId(id);

				System.out.println("Digite o nome do produto");
				nome = teclado.nextLine();

				p.setNome(nome);

				System.out.println("Digite o preco do produto");
				strPreco = teclado.nextLine();
				preco = Double.parseDouble(strPreco);
				p.setPreco(preco);

				System.out.println(p);

				teclado.close();
				deuBom = true;

			} catch (IsiException e) {
				System.out.println("Erro ao preencher: " + e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				System.out.println("Deu erro!");
			}
		} while (!deuBom);
	}
}
