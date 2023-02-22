package core;

public class QuestaoComDica extends Questao{
	private String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	@Override
	public String aplicarQuestao() {
		return super.aplicarQuestao() + " (DICA:"+dica+")";
	}
	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	

}
