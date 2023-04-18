package exercicios;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = leitor.nextInt();
		
		int i = 1;
		int res;
		
		while(i <= 10) {
			res = n * i;
			System.out.println(n + " x " + i + " = " + res);
			i++;
		}
		
		leitor.close();
	}

}
