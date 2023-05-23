package questoes;

public class PessoaInfo {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public PessoaInfo() {
		this.nome = "";
		this.endereco = "";
		this.telefone = "";
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		String info = "Nome: " + getNome() + "\n" + "Endereço: " + getEndereco() +
				"\n" + "Telefone: " + getTelefone();
		
		return info;
	}
}




