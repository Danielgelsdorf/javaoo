import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta conta = new Conta(12345,6,"Professor Isidro", "123.456.789-00");
		int opcao;
		double valor;
//		conta.setNumeroConta(12345);
//		conta.setDigitoVerif(6);
//		conta.setNomeTitular("Professor Isidro");
//		conta.setCpfTitular("123.456.789-00");
		do {
			System.out.println("IsiBank - Seu banco na Internértica");
			System.out.println("1 - Extrato\n2-Deposito\n3-Saque\n0-Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println(conta.exibir());
				break;
			case 2:
				System.out.print(" ---> Digite o valor a depositar:");
				valor = teclado.nextDouble();
				conta.depositar(valor);
				break;
			case 3:
				System.out.print(" ---> Digite o valor a ser sacado:");
				valor = teclado.nextDouble();
				if (conta.sacar(valor)) {
					System.out.println("      SAQUE efetuado!");
				}
				else {
					System.out.println("      SALDO INSUFICIENTE");
				}
				break;
			case 0:
				System.out.println("Obrigado pela preferencia");
				break;
			default:
				System.out.println("Opcao Invalida");
			}
			
		} while (opcao != 0);
		
		teclado.close();
	}
}
