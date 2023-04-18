package exercicios;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int num; 
		
		do {
			System.out.println("Digite um valor inteiro: ");
			num = leitor.nextInt();
			if (num > 0) {
				System.out.println("Positivo!");
			} else if (num < 0) {
				System.out.println("Negativo!");
			} else {
				System.out.println("Fim do programa.");
			}
			
		} while(num != 0);
		
		leitor.close();
	}

}
