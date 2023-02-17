package br.com.isibank.core;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String nomeTitular, String cpfTitular, int numeroConta, double saldo, double limite) {
		super(nomeTitular, cpfTitular, numeroConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeTitular=" + nomeTitular + ", cpfTitular=" + cpfTitular
				+ ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
	}
	
	
	/* A anotação (@) Override indica uma sinalização para o compilador JAVA
	 * conferir se o cabeçalho do método que quero sobrescrever (redefinir) da
	 * classe pai é idêntico em ambas as classes
	 * se por acaso tiver algo distinto (seja na nomenclatur, no tipo de retorno
	 * nos parâmetros e seus respectivos tipos), ele aponta erro de sintaxe	  
	 */
	@Override
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
	
	

}
