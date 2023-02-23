package br.com.professorisidro.core;

public abstract class Funcionario {
	protected String nome;
	protected int    numReg;
	
	public Funcionario(String nome, int numReg) {
		super();
		this.nome = nome;
		this.numReg = numReg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumReg() {
		return numReg;
	}

	public void setNumReg(int numReg) {
		this.numReg = numReg;
	}
	
	public abstract float calcularSalario();

}
