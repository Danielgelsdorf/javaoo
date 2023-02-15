// definicao da classe Conta
public class Conta {
	
	// atributos
	private int numeroConta;
	private int digitoVerif;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	public Conta(int nc, int digitoV, String nomeTit, String cpfTit) {
		this.numeroConta = nc;
		this.digitoVerif = digitoV;
		this.nomeTitular = nomeTit;
		this.cpfTitular  = cpfTit;
		this.saldo = 0.0;
//		System.out.println("Acabei de criar um objeto");
	}
	
	// Getters e Setters
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDigitoVerif() {
		return digitoVerif;
	}
	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
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
	public double getSaldo() {
		return saldo;
	}
	
	// "métodos da lógica de negócios"
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String exibir() {
		String info = "Conta  :"+numeroConta+"/"+digitoVerif+"\n"+
				      "Titular:"+nomeTitular+" ("+cpfTitular+")\n"+
				      "Saldo  : R$ "+String.format("%.2f", saldo);
		return info;
				 
	}
	

}
