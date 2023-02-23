
public class SistemaCanil {
	public static void main(String[] args) {
		
		InterfaceBD ibd;
		
//		ibd = new BDMySQL();
		ibd = new BDOracle();
		ibd.conectar();
		ibd.executarComando("SELECT * from TBL_caes");
		ibd.desconectar();
	}
}
