package exercicios;

public class TotalDeVendas {

	public static void main(String[] args) {
		String nome = "Joao";
		double salarioFixo = 500;
		double vendasPorMes = 1230;
		
		double comissao = vendasPorMes * 0.15;
		double salarioFinal = salarioFixo + comissao;
		
		System.out.println("Funcionario: " + nome);
		System.out.printf("Total a receber: %.2f ", salarioFinal);
	}

}
