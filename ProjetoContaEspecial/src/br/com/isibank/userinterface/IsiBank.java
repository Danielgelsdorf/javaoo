package br.com.isibank.userinterface;

import br.com.isibank.core.Conta;
import br.com.isibank.core.ContaEspecial;

public class IsiBank {
	public static void main(String[] args) {
		Conta co = new Conta("Teste da Conta", "9876",1111,100.0);
		ContaEspecial ce = new ContaEspecial("Teste Especial", "9877", 2222, 100.0, 500.0);
		
		System.out.println(co);
		System.out.println(ce);
		
		
		
		Conta lista[] = new Conta[4];
		lista[0] = new Conta("Adamastor","1234",9876,0.0);
		lista[1] = new ContaEspecial("Deosdedite","1235",9877,0.0, 500.0);
		lista[2] = new Conta("Nilsonclecio","1236",9878,0.0);
		lista[3] = new ContaEspecial("Liderce","1237",9879,0.0, 800.0);
		
		for (Conta c: lista) {
			
			// aqui quero fazer um tratamento específico para contas especiais
			System.out.println("Titular: "+c.getNomeTitular());
			
			// este operador INSTANCEOF confere se o objeto é do tipo ContaEspecial
			if (c instanceof ContaEspecial) {
				System.out.println("   Tem conta especial");
				// se ele for, eu vou manipulá-lo como tal, fazendo uma "conversao forçada" (casting)
				ContaEspecial cc = (ContaEspecial)c;
				System.out.println("   E tem limite de: "+cc.getLimite());				
			}
			else {
				System.out.println("   Tem conta comum");
			}
			
			if (c.debitar(100.0)) {
				System.out.println("Debito autorizado na conta de "+c.getNomeTitular());
			}
			else {
				System.out.println("Desculpe, "+c.getNomeTitular()+", mas o debito foi negado");
			}
		}
	}
}
