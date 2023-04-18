package exercicios;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		int soma = 0;
		int quantidade = 0;
		
		do {
			System.out.println("Digite um número ou [0]Pare");
			num = leitor.nextInt();
			
			soma += num;
			
			if (num != 0) {
				quantidade++;
			}
			
		} while (num != 0);
		
		System.out.println("Soma: " + soma);
		System.out.println("Quantidade: " + quantidade);
		
		leitor.close();
	}

}
