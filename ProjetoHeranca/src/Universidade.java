
public class Universidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Jose", "jose@jose.com", "9123456789");
//		p.setNome("Jose");
//		p.setEmail("jose@jose.com");
//		p.setTelefone("912345678");
		System.out.println(p);
		
		Aluno a = new Aluno("Ana", "ana@ana.com", "987654321", 91827);
//		a.setNome("Ana");
//		a.setEmail("ana@ana.com");
//		a.setTelefone("987654321");
//		a.setNumeroMatricula(91827);
		System.out.println(a);
		
		Pessoa p1,p2;
		p1 = new Pessoa("Zezinho","ze@ze.com","12345");
		p2 = new Aluno("Joaozinho","jao@jao.com","2729342",56468);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
