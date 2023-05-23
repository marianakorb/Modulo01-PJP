package heranca.java;

public class Funcionario extends Pessoa {
	
	private String setor;
	private double salario;
	
	public Funcionario() {
		this.setor = "";
		this.salario = 0.0;
	}
	
	public Funcionario (String setor, double salario, String n, int i) {
		super(n, i); 
		this.setor = setor;
		this.salario = salario;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		String info = "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" +
				"Setor: " + getSetor() + "\n" + "Salário: " + getSalario();
		
		return info;
	}
	
}
