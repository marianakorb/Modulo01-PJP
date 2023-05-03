package respostas;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 5;
		int num;
		
		int[] valores = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor inteiro: ");
			num = leitor.nextInt();
			
			valores[i] = num;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(valores[i] + " ");
		}
		
		leitor.close();
	}

}
