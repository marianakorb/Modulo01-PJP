package exercicios;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 5;
		int[] numeros = new int[n];
		int somaPares = 0;
		double somaImpares = 0;
		double divisor = 0;
		double media;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número inteiro: ");
			numeros[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
			} else {
				divisor++;
				somaImpares += numeros[i];
			}
		}
		
		media = somaImpares / divisor;
		
		System.out.println("Soma dos pares: " + somaPares);
		System.out.println("Média dos ímpares: " + media);
		
		leitor.close();
	}

}
