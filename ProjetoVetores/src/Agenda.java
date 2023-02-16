
public class Agenda {
	public static void main(String[] args) {
		Contato lista[];
		
		lista = new Contato[5];
		lista[0] = new Contato("Jose","jose@jose.com","11987654321");
		lista[1] = new Contato("Pedro","pedro@pedro.com","11978654321");
//		lista[2] = new Contato("Ana","ana@ana.com","11912345678");
		lista[2] = new Contato("","","");
		lista[3] = new Contato("Paula","paula@paula.com","11945678912");
		lista[4] = new Contato("Joao","joao@joao.com","11943215678");
		
		
		
		
//		for (int pos=0; pos<5; pos++) {
//			System.out.println(lista[pos].exibir());
//		}
		
		for(Contato c : lista) {
			System.out.println(c.exibir());
		}
		
		
	}
}
