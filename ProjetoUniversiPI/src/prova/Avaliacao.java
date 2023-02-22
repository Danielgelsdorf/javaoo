package prova;

import java.util.ArrayList;
import java.util.Scanner;

import core.Questao;
import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;

public class Avaliacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Questao> perguntas = new ArrayList<Questao>();
		String resp;
		
		perguntas.add(new Questao("Quanto é 1+1?","2"));
		perguntas.add(new QuestaoComDica("Qual a cor do cavalo Branco do Napoleão?","Marrom","Não confunda nome com cor"));
		perguntas.add(new Questao("Qual a fórmula da água?", "H2O"));
		perguntas.add(new QuestaoComDica("Qual a linguagem do curso?","JAVA","Começa com JA e termina com VA"));
		perguntas.add(new Questao("Quem descobriu o Brasil?", "Pedro Alvares Cabral"));
		perguntas.add(new QuestaoMultiplaEscolha("Quanto vale 2+2?","c","1","2","4","n.d.a"));
		int num=1;
		for (Questao q: perguntas) {
			System.out.println(num + " - " +q.aplicarQuestao());
			num++;
			resp = teclado.nextLine();
			if (q.corrigir(resp)) {
				System.out.println("   ACERTOU!!");
			}
			else {
				System.out.println("   ERROU!!");
			}
		}
		teclado.close();
	}

}
