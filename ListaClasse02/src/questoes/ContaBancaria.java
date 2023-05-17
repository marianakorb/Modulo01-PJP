package questoes;

public class ContaBancaria {
	
	String nome;
	String cpf;
	String numeroDaConta;
	double saldo;
	
	// construtor sem parametros
	public ContaBancaria() {
		nome = "";
		cpf = "";
		numeroDaConta = "";
		saldo = 0;
	}
	
	public ContaBancaria(String nomePessoa, String cpfPessoa, String numConta, double saldoConta) {
		nome = nomePessoa;
		cpf = cpfPessoa;
		numeroDaConta = numConta;
		
		if (saldoConta > 0) {
			saldo = saldoConta;
		} else {
			saldo =+ 0;
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Numero da Conta: " + numConta);
		System.out.println("Saldo: " + saldo);
		System.out.println("-------------------");
	}
	
	public void setNome(String nomePessoa) {
		nome = nomePessoa;
	}
	
	public void setCpf(String cpfPessoa) { 
		cpf = cpfPessoa;
	}
	
	public void setNumDaConta(String numConta) {
		numeroDaConta = numConta;
	}
	
	public void setSaldo(double saldoConta) {
		if (saldoConta > 0) {
			saldo = saldoConta;
		} else {
			saldo =+ 0;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNumDaConta() {
		return numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
}



