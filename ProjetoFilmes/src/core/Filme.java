package core;

public class Filme {
	private String nome;
	private int    ano;
	private String genero;
	private int    duracao;
	private int    classificacao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	@Override
	public String toString() {
		return "Filme :\n"
				+ "[nome=" + nome + ", ano=" + ano + "\n"
				+ " genero=" + genero + ", duracao=" + duracao + "\n"
				+ " classificacao=" + classificacao + "]";
	}
	
	public String toCSV() {
		return nome + ";" + ano +";"+genero+";"+duracao+";"+classificacao;
	}
	

}
