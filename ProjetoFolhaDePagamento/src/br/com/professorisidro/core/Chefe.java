package br.com.professorisidro.core;

public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(String nome, int numReg, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numReg);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	
	public float getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}


	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}


	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}


	public float getBeneficioTerno() {
		return beneficioTerno;
	}


	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}


	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * adicionalFuncao / 100 + beneficioTerno;
	}
	
	

}
