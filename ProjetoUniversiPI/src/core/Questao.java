package core;

public class Questao {
	protected String enunciado;
	protected String resposta;
	
	public Questao(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Questão: "+enunciado;
	}
	
	public boolean corrigir(String respUsuario) {
		return this.resposta.equals(respUsuario);
	}

}
