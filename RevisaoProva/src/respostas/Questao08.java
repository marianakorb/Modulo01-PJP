package respostas;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		char opcao;
		int res;
		
		do {
			System.out.println("Digite um numero: ");
			int num1 = leitor.nextInt();
			System.out.println("Digite outro numero: ");
			int num2 = leitor.nextInt();
			
			System.out.println(" [+] SOMA");
			System.out.println(" [-] SUBTRAÇÃO");
			System.out.println(" [n] SAIR");
			
			opcao = leitor.next().charAt(0);
			
			if (opcao == '+') {
				res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + (res));
			} else if (opcao == '-') {
				res = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + (res));
			} else {
				System.out.println("Saindo...");
			}
			
		} while(opcao == '+' || opcao == '-');
		
		leitor.close();
	}

}
