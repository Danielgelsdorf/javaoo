package br.com.professorisidro.core;

public class Empreiteiro extends Funcionario{
	private float valorEmpreita;

	public Empreiteiro(String nome, int numReg, float valorEmpreita) {
		super(nome, numReg);
		this.valorEmpreita = valorEmpreita;
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}
	
	

}
