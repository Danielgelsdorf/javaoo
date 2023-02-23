import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		try {

			Scanner teclado = new Scanner(System.in);

			int v1, v2, r;
			System.out.println("Digite um valor");
			v1 = teclado.nextInt();
			System.out.println("Digite outro valor");
			v2 = teclado.nextInt();

			r = v1 / v2;

			System.out.println("O resultado da divisao vale " + r);
			teclado.close();
		} 
		catch (InputMismatchException e) {
			System.out.println("Ei, digite um numero inteiro!!!");			
		}
		catch (ArithmeticException e) {
			System.out.println("Puxa, não consigo dividir por zero");
		}
		catch (Exception e) {
			System.out.println("Ops.. deu erro!");
			System.out.println(e.getClass().getName());
		}
	}
}
