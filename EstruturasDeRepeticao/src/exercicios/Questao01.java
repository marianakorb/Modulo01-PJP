package exercicios;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		int opcao;
		double res;
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = leitor.nextDouble();
		System.out.println("Digite outro número: ");
		double num2 = leitor.nextDouble();
		
		do {
			System.out.println(" Calculadora");
			System.out.println("[1] Adição");
			System.out.println("[2]Subtração");
			System.out.println("[3]Divisão");
			System.out.println("[4] Multiplicação");
			System.out.println("[0]Sair");
			
			System.out.println("Digite sua opção: ");
			opcao = leitor.nextInt();
			
			if (opcao == 1) {
				res = num1 + num2;
				System.out.println(res);
			} else if (opcao == 2) {
				res = num1 - num2;
				System.out.println(res);
			} else if (opcao == 3) {
				res = num1 / num2;
				System.out.println(res);
			} else if (opcao == 4) {
				res = num1 * num2;	
				System.out.println(res);
			} else if (opcao == 0) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Escolha inválida");
			}
			
			
		} while(opcao != 0);
		
		
		
		leitor.close();
		
	}

}
