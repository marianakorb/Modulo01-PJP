package exercicios;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		System.out.println("Digite sua altura: ");
		
		double peso = dados.nextDouble();
		double altura = dados.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("O imc é: " + imc);
	}
}
