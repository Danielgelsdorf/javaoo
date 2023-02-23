
public class Moto extends Veiculo {	

	private int cilindrada;

	public Moto(String marca, int cilindrada) {
		super(marca);
		this.cilindrada = cilindrada;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto "+super.marca+"/"+this.cilindrada+ " acelera na mão - PROPRORPORPORPRORPORO");
		
	}

	@Override
	public void frear() {
		System.out.println("Moto "+super.marca+"/"+this.cilindrada+ " freia no Pé!! iiçlJHASDIUFH489RTH134UQGHQSDKLJFÇSA");
		
	}
	
}
