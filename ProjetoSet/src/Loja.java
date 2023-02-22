import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Loja {
	public static void main(String[] args) {
		
		HashSet<Produto> lista = new HashSet<Produto>();
		lista.add(new Produto(1, "Computador", 1500));
		lista.add(new Produto(1, "Teclado", 30));
		lista.add(new Produto(10, "Mouse", 50));
		lista.add(new Produto(25, "Impressora", 400));
		
		
		
//		Iterator<Produto> it = lista.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		// eu não consigo fazer o percurso dessa lista com um "FOR" normal (com o índice e tal)
		// só consigo através do "FOR-EACH"
		// por que isso? Porque internamente eu uso o equivalente ao código anterior
		// (com iterator)
//		for (Produto p: lista) {
//			System.out.println(p);
//		}
		
		HashMap<String, Double> cotacoes = new HashMap<String, Double>();
		cotacoes.put("ITUB4", 30.00);
		cotacoes.put("PETR3", 22.50);
		cotacoes.put("VALE4", 30.00);
		
		Iterator<Double> it2 = cotacoes.values().iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("-----------------------");
		cotacoes.put("ITUB4", 80.72);
		
		Iterator<Double> it3 = cotacoes.values().iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
	}

}

