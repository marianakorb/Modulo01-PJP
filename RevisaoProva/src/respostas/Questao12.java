package respostas;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 5;
		char[] letras = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite uma letra do alfabeto: ");
			letras[i] = leitor.next().charAt(0);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(letras[i] + " ");
		}
		
		leitor.close();
	}

}
