
public class Paralelepipedo extends FormaGeometrica implements Forma3D {
	private double largura;
	private double altura;
	private double profundidade;

	public Paralelepipedo(double largura, double altura, double profundidade) {
		super();
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return largura * altura * profundidade;
	}

	@Override
	public String exibirInfo() {
		// TODO Auto-generated method stub
		return "Paralelepipedo de largura " + largura + ", altura " + altura + " e profundidade " + profundidade
				+ " tem volume de " + calcularVolume();
	}

}
