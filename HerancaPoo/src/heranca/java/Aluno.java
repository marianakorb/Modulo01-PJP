package heranca.java;

// extends - herdando metodos da classe Pessoa 
public class Aluno extends Pessoa{
	
	private String matricula;
	private String curso;
	private boolean estadoMatricula;
	
	public Aluno() {
		this.matricula = "";
		this.curso = "";
		this.estadoMatricula = false;
	}
	
	public Aluno(String m, String c, boolean eM, String n, int i) {
		super(n, i); //  inicializar construtor da classe pai: Pessoa(n, i);
		this.matricula = m;
		this.curso = c;
		this.estadoMatricula = eM;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public boolean isEstadoMatricula() {
		return estadoMatricula;
	}
	public void setEstadoMatricula(boolean estadoMatricula) {
		this.estadoMatricula = estadoMatricula;
	}
	
	@Override
	public String toString() {
		
		String info = "Nome: " + getNome() + "\n" + "Idade: " + getIdade()
				+ "\n" + "Matricula: " + getMatricula() +"\n" + "Curso: " + getCurso()
				+ "\n" +"Estado da Matricula: " + isEstadoMatricula();
		
		return info;
	} 
	
	
}
