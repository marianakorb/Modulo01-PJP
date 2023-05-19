package questoes;

public class Aluno {
	private String nomeAluno;
	private int idadeAluno;
	private String matriculaAluno;
	
	public Aluno() {
		this.nomeAluno = "";
		this.idadeAluno = 0;
		this.matriculaAluno = "";
		
		apresentar();
	}
	
	public Aluno(String nome, int idade, String matricula) {
		this.nomeAluno = nome;
		
		if(idade > 0) {
			this.idadeAluno = idade;
		} else {
			this.idadeAluno = 0;
		}
		
		this.matriculaAluno = matricula;
		
		apresentar();
	}
	
	public void setNome(String nome) {
		this.nomeAluno = nome;
	}
	
	public void setIdade(int idade) {
		
		if(idade > 0) {
			this.idadeAluno = idade;
		} else {
			this.idadeAluno = 0;
		}
		
	}
	
	public void setMatricula(String matricula) {
		this.matriculaAluno = matricula;
	}
	
	public String getNome() {
		return this.nomeAluno;
	}
	
	public int getIdade() {
		return this.idadeAluno;
	}
	
	public String getMatricula() {
		return this.matriculaAluno;
	}
	
	public void apresentar() {
			
			System.out.println("-----------------------------");
			System.out.println("            ALUNO " );
			System.out.println("-----------------------------");
			System.out.println("Nome: " + this.nomeAluno);
			System.out.println("Idade: " + this.idadeAluno);
			System.out.println("Matrícula: " + this.matriculaAluno);
			System.out.println("-----------------------------");
				
		}
			
}
