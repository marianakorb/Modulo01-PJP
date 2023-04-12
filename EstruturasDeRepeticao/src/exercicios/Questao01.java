package exercicios;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		System.out.println("Escolha uma operadoração: [1]Adição [2]Subtração [3]Divisão [4] Multiplicação [0]Sair ");
		
		Scanner escolha =  new Scanner(System.in);
		
		int operador = escolha.nextInt();
		String op;
		
		switch (operador) {
			case 1:
				op = "+";
				System.out.println(op);
				break;
			case 2:
				op = "-";
				System.out.println(op);
				break;
			case 3:
				op = "/";
				System.out.println(op);
				break;
			case 4:
				op = "*";
				System.out.println(op);
				break;
			case 0:
				op = "Saindo...";
				System.out.println(op);
				break;
			default:
				System.out.println("Escolha inválida");
				break;
		}
		
		escolha.close();
		
		
	}

}
