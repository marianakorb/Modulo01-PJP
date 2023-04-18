package exercicios;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro maior que zero: ");
		int num = leitor.nextInt();
		
		while (num >= 0 ) {
			System.out.println(num);
			num--;
		}
		
		leitor.close();
	}
}
