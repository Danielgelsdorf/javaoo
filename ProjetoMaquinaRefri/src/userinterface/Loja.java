package userinterface;

import java.util.Scanner;

import core.Maquina;

public class Loja {
	public static void main(String[] args) {
		Maquina m;
		m = new Maquina();
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		double valor;
		
		do {
			System.out.println(m.exibirDisplay());
			System.out.println("100 - Inserir crédito");
			System.out.println("101 - Solicitar Troco");
			System.out.println(" -1 - Encerrar");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				int res = m.comprarRefri(opcao);
				if (res == 0) {
					System.out.println("Aproveite seu refrigerante");
				}
				else if (res == -1) {
					System.out.println("ERRO - Saldo Insuficiente");
				}
				else {
					System.out.println("ERRO - Estoque Insuficiente");
				}
				break;
			case 100:
				System.out.println("Digite o valor a ser inserido");
				valor = teclado.nextDouble();
				m.adicionarCredito(valor);
				break;
			case 101:
				System.out.println("Seu troco R$ "+m.solicitarTroco());
				break;
			case -1:
				System.out.println("Obrigado");
				break;
			default:
				System.out.println("Opcao Invalida");
				break;
			}
		} while (opcao != -1);
		
	}
}
