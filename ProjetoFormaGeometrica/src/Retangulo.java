
public class Retangulo extends FormaGeometrica implements Forma2D {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return base + altura + base + altura;
	}

	@Override
	public String exibirInfo() {
		// TODO Auto-generated method stub
		return "Retangulo de base " + base + " altura " + altura + " tem area " + calcularArea() + " e perimetro "
				+ calcularPerimetro();
	}

}
