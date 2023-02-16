package core;

public class Maquina {
	private Refrigerante lista[];
	private double credito;
	
	public Maquina() {
		this.lista = new Refrigerante[5];
		this.lista[0] = new Refrigerante("Coca Cola",2.50,10);
		this.lista[1] = new Refrigerante("Fanta", 2.20, 5);
		this.lista[2] = new Refrigerante("Pepsi", 2.00, 8);
		this.lista[3] = new Refrigerante("Sprite", 1.80, 5);
		this.lista[4] = new Refrigerante("Guarana", 2.00, 8);
		this.credito = 0.0;
	}
	
	public void adicionarCredito(double valor) {
		this.credito += valor;
	}
	
	// na compra temos 3 possibilidades
	//  0 - compra bem sucedida
	// -1 - saldo insuficiente
	// -2 - estoque zerado
	public int comprarRefri(int numRefri) {
		if (this.credito >= lista[numRefri].getPreco()) {     // tenho credito?
			if (lista[numRefri].getQtde() > 0) {              // tem estoque?
				
				this.credito -= lista[numRefri].getPreco();   // atualizar o saldo do credito
				int qtdRefri = lista[numRefri].getQtde() -1;
				lista[numRefri].setQtde(qtdRefri);            // atualizo o estoque de refri (-1)
				return 0;
			}
			return -2;
		}
		return -1;
		
	}
	
	public double solicitarTroco() {
		double troco = this.credito;
		this.credito = 0.0;
		return troco;		
	}
	
	
	public String exibirDisplay() {
		String display = "Maquina de Refri - Seu saldo R$ "+String.format("%.2f", credito)+"\n"+
	                     "----------------------------------------------------\n";
		for (int i=0; i<5;i++) {
			display += "  "+i+"-"+lista[i].getNome()+String.format(" - R$ %.2f\n",lista[i].getPreco());
		}
		return display;
	}	
}