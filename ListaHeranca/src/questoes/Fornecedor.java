package questoes;

public class Fornecedor extends PessoaInfo {
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor() {
		this.valorCredito = 0.0;
		this.valorDivida = 0.0;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		double dif = getValorCredito() - getValorDivida();
		
		return dif;
	}
	
	@Override
	public String toString() {
		String info = "Nome: " + getNome() + "\n" + "Endereço: " + getEndereco() + "\n"
				+ "Telefone: " + getTelefone() + "\n" + "Valor Crédito: " + getValorCredito()
				+ "\n" + "Valor Dívida: " + getValorDivida() + "\n" + "Diferença: " + 
				obterSaldo();
		
		return info;
	}
	
}
