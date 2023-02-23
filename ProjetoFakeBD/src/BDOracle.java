
public class BDOracle implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Connecting on Oracle Database");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Disconnecting from Oracle Database");
		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("oracle> "+comando);
		
	}

}
