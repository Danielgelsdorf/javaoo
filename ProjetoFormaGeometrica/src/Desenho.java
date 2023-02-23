
public class Desenho {
	public static void main(String[] args) {
		FormaGeometrica f1, f2, f3;
		
		f1 = new Retangulo(10, 5);
		f2 = new Paralelepipedo(5,  3, 4);
		f3 = new Cubo(3);
		
		System.out.println(f1.exibirInfo());
		System.out.println(f2.exibirInfo());
		System.out.println(f3.exibirInfo());
	}
}
