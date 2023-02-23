
public class BDMySQL implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectando no Banco MySQL");		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do Banco MySQL");		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("mysql> "+comando);		
	}

}
