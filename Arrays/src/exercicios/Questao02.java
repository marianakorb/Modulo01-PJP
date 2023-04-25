package exercicios;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int quant = 5;
		int[] valores = new int[quant];
		
		for(int i = 0; i < quant; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			valores[i] = leitor.nextInt();
		}
		
		for(int valor : valores) {
			System.out.print(valor);
		}
		
		leitor.close();
	}

}
