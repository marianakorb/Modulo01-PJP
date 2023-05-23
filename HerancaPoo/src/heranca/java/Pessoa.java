package heranca.java;

public class Pessoa extends Object {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome = "";
		this.idade = 0;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public int getIdade() {
		return this.idade;
	}

	public String getNome() {
		return this.nome;
	}
	
	// representação em string do astributos que temos
	@Override
	public String toString() {
		
		String info = "Nome: " + getNome() + "\n" + "Idade: " + getIdade();
		
		return info;
	} 
	
	
}
