
public class Aluno extends Pessoa{
	private int numeroMatricula;
	
	
	public Aluno(String nome, String email, String telefone, int numeroMatricula) {
		super(nome, email, telefone);
		this.numeroMatricula = numeroMatricula;
	}

	public String toString() {
		return super.toString() + "-"+numeroMatricula;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

}
