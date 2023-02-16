
public class Universidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Jose");
		p.setEmail("jose@jose.com");
		p.setTelefone("912345678");
		System.out.println(p.exibir());
		
		Aluno a = new Aluno();
		a.setNome("Ana");
		a.setEmail("ana@ana.com");
		a.setTelefone("987654321");
		a.setNumeroMatricula(91827);
		System.out.println(a.exibir());
	}
}
