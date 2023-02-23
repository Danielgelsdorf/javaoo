package br.com.professorisidro.ui;

import java.util.ArrayList;

import br.com.professorisidro.core.*;

public class FolhaDePagamento {
	public static void main(String[] args) {
		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe("Jose Chefe", 1234, 10000.00f, 15.00f, 2500.00f));
		lista.add(new Horista("Maria Horista", 1235, 200, 79.70f));
		lista.add(new Comissionado("Joao Comissionado", 1236, 3000.00f, 22.75f));
		lista.add(new Empreiteiro("Dejair Empreiteiro", 1237, 5490.00f));
		
		for (Funcionario f: lista) {
			System.out.println("------------------------------------------");
			System.out.println(f.getNome() + String.format("   R$ %.2f", f.calcularSalario()));
			
		}
		System.out.println("------------------------------------------");
	}

}
