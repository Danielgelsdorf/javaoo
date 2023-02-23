
public abstract class Veiculo {

	protected String marca;
		
	public Veiculo(String marca) {
		super();
		this.marca = marca;
	}
	public abstract void acelerar();
	public abstract void frear();
}
