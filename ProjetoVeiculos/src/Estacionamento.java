
public class Estacionamento {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro("Fiote","Uninho");
		v2 = new Moto("Honda CGzinha", 125);
		
		v1.acelerar();
		v1.frear();
		v2.acelerar();
		v2.frear();
	}
}
