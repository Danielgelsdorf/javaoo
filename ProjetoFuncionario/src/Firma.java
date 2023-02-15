import java.util.Scanner;

public class Firma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		String cargo;
		double salario;
		double aumento;
		
		System.out.println("Digite o nome do Funcionario");
		nome = teclado.nextLine();
		System.out.println("Digite o cargo do Funcionario");
		cargo = teclado.nextLine();
		System.out.println("Digite o salario do Funcionario");
		salario = teclado.nextDouble();
		
		Funcionario f = new Funcionario(nome, cargo, salario);
		
		System.out.println(f.imprimir());
		System.out.println("Qual o percentual de aumento do funcionario?");
		aumento = teclado.nextDouble();
		f.aumentarSalario(aumento);
		System.out.println(f.imprimir());
	}
}
