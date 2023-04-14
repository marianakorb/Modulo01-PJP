package exercicios;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		System.out.println("Digite um valor maior que 0(zero): ");
		
		Scanner valor = new Scanner(System.in);
		
		int n = valor.nextInt();
		
		for(int i = n; i >= 0; i--) {
			System.out.println(i);
		}
		valor.close();
	}

}
