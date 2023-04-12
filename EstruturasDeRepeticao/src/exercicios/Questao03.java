package exercicios;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		System.out.println("Digite um número maior que zero: ");
		
		Scanner numero = new Scanner(System.in);
		
		int num = numero.nextInt();
		
		int res; 
		
		for (int i = 1; i <=10; i = i + 1) {
			res = num * i;
			System.out.println(num + " x " + i + " = " + res);
		}
		
		numero.close();
	}

}
