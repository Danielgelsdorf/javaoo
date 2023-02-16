import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Permissao p = new Permissao(7182,"Administrador");
		
		Usuario u = new Usuario("isidro","1234",p);
		
		System.out.println("Digite seu login:");
		String lo = teclado.nextLine();
		System.out.println("Digite sua senha:");
		String se = teclado.nextLine();
		if (u.fazerLogin(lo, se)) {
			System.out.println(u.exibir());
		}
		else {
			System.out.println("Acesso Negado!");
		}
	}
}
