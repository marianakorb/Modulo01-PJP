package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Você quer a tabuada de qual núemero? ");
		
		int produto = numero.nextInt();
		int resultado;
		
		for (int i = 0; i <= 10; i++) {
			  resultado = i * produto;
			  System.out.println(produto + " x " + i + " = " + resultado);
			}
		numero.close();
	}

}
