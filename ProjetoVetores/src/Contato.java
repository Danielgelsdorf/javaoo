
public class Contato {
	private String nome;
	private String email;
	private String whatsapp;
	public Contato(String nome, String email, String whatsapp) {
		super();
		this.nome = nome;
		this.email = email;
		this.whatsapp = whatsapp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	
	public String exibir() {
		return nome+"/"+email+" ("+whatsapp+")";
	}
	
}
