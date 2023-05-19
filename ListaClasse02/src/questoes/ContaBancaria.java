package questoes;

public class ContaBancaria {
	
	String nome;
	String cpf;
	String numeroDaConta;
	double saldo;
	
	// construtor sem parametros
	public ContaBancaria() {
		this.nome = "";
		this.cpf = "";
		this.numeroDaConta = "";
		this.saldo = 0;
	}
	
	public ContaBancaria(String nomePessoa, String cpfPessoa, String numConta, double saldoConta) {
		this.nome = nomePessoa;
		this.cpf = cpfPessoa;
		this.numeroDaConta = numConta;
		
		if (saldoConta > 0) {
			this.saldo = saldoConta;
		} else {
			this.saldo =+ 0;
		}
		
		apresentar();
	}
	
	public void setNome(String nomePessoa) {
		this.nome = nomePessoa;
	}
	
	public void setCpf(String cpfPessoa) { 
		this.cpf = cpfPessoa;
	}
	
	public void setNumDaConta(String numConta) {
		this.numeroDaConta = numConta;
	}
	
	public void setSaldo(double saldoConta) {
		if (saldoConta > 0) {
			this.saldo = saldoConta;
		} else {
			this.saldo =+ 0;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNumDaConta() {
		return this.numeroDaConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void apresentar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Numero da Conta: " + this.numConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("-------------------");
	}
}



