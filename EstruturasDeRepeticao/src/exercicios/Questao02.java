package exercicios;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		int opcao;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		Scanner leitor =  new Scanner(System.in);

		do {
			System.out.println("[1] ÁLCOOL");
			System.out.println("[2] GASOLINA");
			System.out.println("[3] DIESEL");
			System.out.println("[4] Fim");
			
			System.out.println("Escolha seu combustível: ");
			opcao = leitor.nextInt();
			
			if (opcao == 1) {
				alcool++;
			} else if (opcao == 2) {
				gasolina++;
			} else if (opcao == 3) {
				diesel++;
			} else if (opcao == 4) {
				System.out.println("FIM");
			} else {
				System.out.println("Opção Inválida. Escolha outra:");
			}
			
		} while (opcao != 4);
		
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		leitor.close();
	}

}
