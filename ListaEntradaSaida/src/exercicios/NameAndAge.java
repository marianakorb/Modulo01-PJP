package exercicios;

import java.util.Scanner;

public class NameAndAge {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner lerDoTeclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome e sua idade: ");
		
		nome = lerDoTeclado.next();
		idade = lerDoTeclado.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		lerDoTeclado.close();
	
	}
	
}
