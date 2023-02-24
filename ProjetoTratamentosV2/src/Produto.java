
public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) throws IsiException {
		if (id <= 0) {
			throw new IsiException("ID nao pode ser menor ou igual a Zero!");
		}
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws IsiException {	
		if (nome == null || nome.length() == 0) {
			throw new IsiException("Nome precisa ser preenchido");
		}
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco)  throws IsiException{
		if (preco < 0) {
			throw new IsiException("Preco nao pode ser negativo");
		}
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}
