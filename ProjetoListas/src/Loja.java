import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "Computador", 1500));
		lista.add(new Produto(2, "Mouse", 50));
		lista.add(new Produto(3, "Teclado", 100));
		lista.add(new Produto(4, "Impressora", 500));
		
		System.out.println("Posicao 2 = "+lista.get(2));
		
		lista.remove(1);
		for (Produto p: lista) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------------------");
		lista.add(1, new Produto(2, "Mouse", 50));
		for (Produto p: lista) {
			System.out.println(p);
		}
		
	}

}
