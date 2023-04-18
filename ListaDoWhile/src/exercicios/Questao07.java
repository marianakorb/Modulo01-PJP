package exercicios;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		double soma = 0; 
		int i = 1;
		
		while (i <= 3) {
			
			System.out.println("Digite a " + i + "° nota: ");
			double nota = leitor.nextInt();
			soma = soma + nota;
			i++;
		}
		
		double media = soma / 3;
		
		System.out.printf("Média: %.2f ", media);
		leitor.close();
	}

}
