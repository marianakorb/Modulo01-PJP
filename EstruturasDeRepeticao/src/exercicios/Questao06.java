package exercicios;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		System.out.println("Digite um valor maior que 1: ");
		
		Scanner valor = new Scanner(System.in);
		
		int n = valor.nextInt();
		double soma = 0;
		double media;
		
		for (int i = 1; i <= n; i++) {
			soma += i;
		}
		media = soma / n;
		System.out.println(media);
		valor.close();
	}

}
