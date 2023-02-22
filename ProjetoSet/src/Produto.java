
public class Produto {
	private int codigo;
	private String nome;
	private double preco;

	public Produto(int codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Produto) {
			Produto outro = (Produto) obj;
			return this.codigo == outro.codigo && this.nome.equals(outro.nome) && this.preco == outro.preco;
		}
		return false;
	}

	// retorna qual posicão o meu objeto vai assumir no vetor
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
