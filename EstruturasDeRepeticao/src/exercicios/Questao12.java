package exercicios;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		System.out.println("Digite um número maior que zero: ");
		
		Scanner numero = new Scanner(System.in);
		
		int n = numero.nextInt();
		
		double soma = 0;
		
		for(double i = 1; i <= n; i++) {
			soma = soma + 1/i;
		}
		System.out.printf("%.2f", soma);
		
		numero.close();
	}

}
