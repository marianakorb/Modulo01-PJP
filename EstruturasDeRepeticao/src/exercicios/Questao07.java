package exercicios;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		System.out.println("Digite um valor inteiro maior que 0: ");
		
		Scanner valor = new Scanner(System.in);
		
		int n = valor.nextInt();
		int soma = 0;
		for (int i = 0; i <= n; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		valor.close();
	}

}
