package questoes;

public class Empregado extends PessoaInfo {
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
		this.codigoSetor = 0;
		this.salarioBase = 0.0;
		this.imposto = 0.0;
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		if (codigoSetor > 0) {
			this.codigoSetor = codigoSetor;
		} else {
			this.codigoSetor = 1;
		}
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		if (imposto >= 0 && imposto <= 1) {
			this.imposto = imposto;
		} else {
			this.imposto = 0;
		}
	}
	
	public double calculaSalario() {
		double liquido = getSalarioBase() - (getSalarioBase() * getImposto());
		
		return liquido;
	}
	
	@Override
	public String toString() {
		String info = "Nome: " + getNome() + "\n" + "Endereço: " + getEndereco() +
				"\n" + "Telefone: " + getTelefone() + "\n"+ "Codigo Setor: " + getCodigoSetor() + 
				"\n" + "Salario Base: " + getSalarioBase() + "\n" + "Imposto: " + getImposto() + 
				"\n" + "Salário líquido: " + calculaSalario();
		
		return info;
	}
	
	
	
	
}
