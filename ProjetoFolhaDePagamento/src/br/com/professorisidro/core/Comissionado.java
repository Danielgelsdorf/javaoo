package br.com.professorisidro.core;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;
	
	public Comissionado(String nome, int numReg, float salarioBase, float comissao) {
		super(nome, numReg);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * comissao / 100;
	}
	
	

}
