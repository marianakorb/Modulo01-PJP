package questoes;

public class Main05 {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria("Mariana Korb", "12345678", "78566-99", 1000);
	
		ContaBancaria conta = new ContaBancaria();
		
		conta.setNome("José da Silva");
		conta.setCpf("9876543210");
		conta.setNumDaConta("56981-55");
		conta.setSaldo(2000);
		
		String nome = conta.getNome();
		String cpf = conta.getCpf();
		String numConta = conta.getNumDaConta();
		double saldo = conta.getSaldo();
		
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Numero da Conta: " + numConta);
		System.out.println("Saldo: " + saldo);
	}

}
