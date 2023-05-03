package respostas;

import java.util.Arrays;
import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 3;
		String fruta;
		
		String[] frutas = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite a " + (i+1) + "° fruta: ");
			fruta = leitor.next();
			
			frutas[i] = fruta;
		}
		
		Arrays.sort(frutas);
		
		System.out.println("--------------------");
		System.out.println("Em ordem alfabética: ");
		System.out.println("--------------------");
		for (int i = 0; i < n; i++) {
			System.out.println(frutas[i]);
		}
		
		leitor.close();
	}

}
