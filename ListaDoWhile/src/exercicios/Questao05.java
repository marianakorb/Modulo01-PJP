package exercicios;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite valor inteiro maior que 1: ");
		int valor = leitor.nextInt();
		
		int soma = 0;
		int i = 1;
		
		while (i <= valor) {
			soma = soma + i;
			i++;
		}
		
		System.out.println(soma);
		
		leitor.close();
	}

}
