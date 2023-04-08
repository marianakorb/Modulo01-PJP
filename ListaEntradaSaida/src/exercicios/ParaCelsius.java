package exercicios;

import java.util.Scanner;

public class ParaCelsius {

	public static void main(String[] args) {
		Scanner graus = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		
		float fahr = graus.nextFloat();
		
		float celsius = ((fahr - 32) * 5 ) / 9;
		
		System.out.println("A temperatura em Celsius é: " + celsius);
		
		graus.close();
	}

}
