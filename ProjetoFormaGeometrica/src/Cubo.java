
public class Cubo extends FormaGeometrica implements Forma2D, Forma3D {
	private double lado;

	public Cubo(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return lado*lado*lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 6*(lado*lado);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 14 * lado;
	}

	@Override
	public String exibirInfo() {
		// TODO Auto-generated method stub
		return "Cubo de lado "+lado+" tem area "+calcularArea()+" perimetro "+calcularPerimetro()+ " e volume "+calcularVolume();
	}
	
}
