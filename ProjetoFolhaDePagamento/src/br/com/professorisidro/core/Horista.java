package br.com.professorisidro.core;

public class Horista extends Funcionario {
	private int numeroHoras;
	private float valorHora;
	
	public Horista(String nome, int numReg, int numeroHoras, float valorHora) {
		super(nome, numReg);
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorHora * numeroHoras;
	}
}
