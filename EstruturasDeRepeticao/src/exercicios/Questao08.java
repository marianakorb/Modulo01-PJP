package exercicios;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		System.out.println("Digite um valor maior que 1: ");
		
		Scanner valor = new Scanner(System.in);
		
		int n = valor.nextInt();
		String ast = "*";
		
		for (int i = 1; i <= n; i++) {
			System.out.println(ast);
			System.out.print(ast);
			
		}
	}

}
