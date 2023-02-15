
public class Biblioteca {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setTitulo("Java para Iniciantes");
		livro.setAutor("Prof. Isidro");
		livro.setAno(2020);
		livro.setCategoria("Terror");
		livro.setPosE(5);
		livro.setPosP(7);
		livro.emprestar();
		livro.exibir();
		
		System.out.println("-------------------------------------");
		livro.devolver();
		livro.exibir();
		
		System.out.println(livro.getTitulo()+" foi devolvido por alguem");
	}
}
