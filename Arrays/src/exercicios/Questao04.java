package exercicios;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 5;
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		int[] quantFilhos = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite seu nome: ");
			nomes[i] = leitor.next();
			
			System.out.println("Digite sua idade: ");
			idades[i] = leitor.nextInt();
			
			System.out.println("Digite a quantidade de filhos: ");
			quantFilhos[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(nomes[i] + " tem " + idades[i] + " anos e " + quantFilhos[i] + " filhos");
		}
		
		leitor.close();
	}

}
