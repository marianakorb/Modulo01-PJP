package exercicios;

import java.util.Scanner;

public class EmMetros {
	
	public static void main(String[] args) {
	Scanner emMetros = new Scanner(System.in);
	
	System.out.println("Digite um valor em metros: ");
	
	double valorEmCm = emMetros.nextDouble() * 100;
	double valorEmDec = emMetros.nextDouble() * 10;
	double valorEmMili = emMetros.nextDouble() * 1000;
	
	System.out.println("Valor em decímetro: " + valorEmDec);
	System.out.println("Valor em centímetro: " + valorEmCm);
	System.out.println("Valor em milímetro: " + valorEmMili);
	emMetros.close();
}
}
