
public class Carro extends Veiculo{
	private String modelo;

	public Carro(String marca, String modelo) {
		super(marca);
		this.modelo = modelo;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro "+modelo+" acelera no pé: VRUUUMMMMMM");
		
	}

	@Override
	public void frear() {
		System.out.println("Carro "+modelo+ " freia na mão! IIIIICCCHHHHHHHH");		
	}

	

	
	

}
