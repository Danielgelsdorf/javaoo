
public class TestePedido {
	public static void main(String[] args) {
		Pedido p1 = new Pedido(1234, "15/02/2023", 1500,
				new Cliente("Professor Isidro", "isidro@isidro.com", "987.654.321-00"),
				new Produto(10, "Computador", 1500));
		System.out.println(p1.exibir());
		
		Cliente c1 = new Cliente("Seu Jose","jose@jose.com","123.456.789-00");
		Produto pr = new Produto(11,"Teclado", 250.0);
		Pedido  p2 = new Pedido(1235,"15/02/2023",250, c1, pr);
		System.out.println(p2.exibir());
	}
}
