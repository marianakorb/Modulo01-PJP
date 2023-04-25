package exercicios;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos nomes você deseja inserir? ");
		int n = leitor.nextInt();
		
		String[] nomes = new String[n];
 		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome");
			nomes[i] = leitor.next();
		}
		
		for (String nome : nomes) {
			 System.out.println(nome);
		}
		
		leitor.close();
	}

}
