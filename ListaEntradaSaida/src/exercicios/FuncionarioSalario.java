package exercicios;

import java.util.Scanner;

public class FuncionarioSalario {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite seu numero de identificação: ");
		System.out.println("Quantidade de horas trabalhadas: ");
		System.out.println("Valor que recebe por hora: ");
		
		int numFuncionario = dados.nextInt();
		float horas = dados.nextFloat();
		float valorPorHora = dados.nextFloat();
		
		float salario = horas * valorPorHora;
		
		System.out.printf("O funcionario do numero " + numFuncionario + " R$ recebe %.2f ", salario);
		
		dados.close();
	}

}
