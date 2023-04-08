package exercicios;

import java.util.Scanner;

public class CombustivelGasto {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Qual a distancia percorrida (em km)? ");
		System.out.println("Qual total de combustivel gastos? ");
		
		int distancia = dados.nextInt();
		float combustivel = dados.nextFloat();
		
		double consumo = distancia / combustivel;
		
		System.out.printf("Consumo medio: %.3f", consumo);
		
		dados.close();
	}

}
