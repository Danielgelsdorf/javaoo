
public class Aluno extends Pessoa{
	private int numeroMatricula;

	public String exibir() {
		return nome + "-"+email+"-"+getTelefone()+"-"+numeroMatricula;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

}
