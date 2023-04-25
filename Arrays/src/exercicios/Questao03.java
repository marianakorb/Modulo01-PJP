package exercicios;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int quant = 5;
		int[] valores = new int[quant];
		int positivos = 0, negativos = 0, zeros = 0, pares = 0, impares = 0;
		
		for(int i = 0; i < quant; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			valores[i] = leitor.nextInt();
		}
		
		for(int valor : valores) {
			
			if (valor > 0) {
				positivos++;
			} else if (valor < 0) {
				negativos++;
			} else {
				zeros++;
			}
			
			if (valor % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("POsitivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Zeros: " + zeros);
		System.out.println("Pares: " + pares);
		System.out.println("Ímpares: " + impares);
		
		leitor.close();
	}

}
