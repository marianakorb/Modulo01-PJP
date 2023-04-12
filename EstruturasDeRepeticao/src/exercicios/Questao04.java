package exercicios;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
        System.out.println("Digite um número maior que zero: ");
        System.out.println("Digite o início da tabuada: ");
        System.out.println("Digite o final da tabuada: ");
		
		Scanner numero = new Scanner(System.in);
		
		int num = numero.nextInt();
		int inicio = numero.nextInt();
		int fim = numero.nextInt();
		
		int res; 
		
		for (int i = inicio; i <= fim; i++) {
			res = num * i;
			System.out.println(num + " x " + i + " = " + res);
		}
		
		numero.close();

	}

}
