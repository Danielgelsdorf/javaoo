
public class Pedido {
	private int numero;
	private String data;
	private double valorTotal;
	private Cliente cliente;
	private Produto produto;

	public Pedido(int numero, String data, double valorTotal, Cliente cliente, Produto produto) {
		super();
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.produto = produto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String exibir() {
		return "Pedido #" + numero + " Data:" + data + String.format("  R$ %.2f\n", valorTotal) + "Cliente:"
				+ cliente.getNome() + " (" + cliente.getCpf() + ")\n" + "Produto:" + produto.getNome()
				+ String.format("  R$ %.2f", produto.getPreco());
	}

}
