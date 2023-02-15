
public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = 0.0;
	}
	public Funcionario(String nome) {
		this.nome = nome;
		this.cargo = "*Nao atribuido*";
		this.salario = 0.0;
	}
	public Funcionario() {
		this.nome = "NOVO FUNCIONARIO";
		this.cargo = "*Nao atribuido*";
		this.salario = 0.0;
	}

	public String imprimir() {
		return "Funcionario: "+nome+" ("+cargo+") R$ "+String.format("%.2f", salario);
	}
	
	public void aumentarSalario(double percentual) {
		this.salario += salario * percentual / 100;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
