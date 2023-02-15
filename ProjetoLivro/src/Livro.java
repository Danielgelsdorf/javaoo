
public class Livro {
	private String  titulo;
	private String  autor;
	private int     ano;
	private String  categoria;
	private int     posE;
	private int     posP;
	private boolean disponivel;
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPosE() {
		return posE;
	}

	public void setPosE(int posE) {
		this.posE = posE;
	}

	public int getPosP() {
		return posP;
	}

	public void setPosP(int posP) {
		this.posP = posP;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	void emprestar() {
		disponivel = false;
	}
	
	void devolver() {
		disponivel = true;
	}
	
	void exibir() {
		System.out.println("Livro: "+titulo+ " ("+ano+")");
		System.out.println("Autor: "+autor);
		System.out.println("Categoria: "+categoria);
		System.out.println("Localizacao: E"+posE+" P"+posP);
		if (disponivel) {
			System.out.println("Livro Disponivel para Emprestimo");
		}
		else {
			System.out.println("Livro INDISPONIVEL para Emprestimo");
		}
	}
}
