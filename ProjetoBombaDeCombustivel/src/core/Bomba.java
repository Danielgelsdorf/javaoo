package core;

public class Bomba {
	private Combustivel combustivel;
	private double qtdLitros;
	private double valorTotal;
	
	public Bomba(Combustivel combustivel) {
		super();
		this.combustivel = combustivel;
	}
	
	public void abastecerPorLitros(double litros) {
		this.qtdLitros = litros;
		this.valorTotal = this.qtdLitros * combustivel.getPrecoLitro();
	}
	
	public void abastecerPorValor(double valor) {
		this.valorTotal = valor;
		this.qtdLitros = this.valorTotal / combustivel.getPrecoLitro();
	}
	
	public String imprimirRecibo() {
		return "=============================================\n"+
	           "    IsidroCORP Gas & Energy\n"+
			   "---------------------------------------------\n"+
	           " Combustivel: "+combustivel.getNome()+"\n"+
			   " Preço Litro R$ "+String.format("%.3f\n", combustivel.getPrecoLitro())+
			   " Abastecidos    "+String.format("%.3f litros\n", this.qtdLitros)+
			   " Total a Pagar R$ "+String.format("%.2f\n", this.valorTotal)+
			   "=============================================";
			
	}
	
	

}
