package br.com.isibank.core;

public class Conta {
	protected String nomeTitular;
	protected String cpfTitular;
	protected int    numeroConta;
	protected double saldo;
	
	public Conta(String nomeTitular, String cpfTitular, int numeroConta, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", cpfTitular=" + cpfTitular + ", numeroConta=" + numeroConta
				+ ", saldo=" + saldo + "]";
	}
	
	
}
