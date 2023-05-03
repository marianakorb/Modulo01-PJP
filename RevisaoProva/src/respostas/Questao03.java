package respostas;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String diaDaSemana;
		
		System.out.println("Digite um número de 1 a 7: ");
		int num = leitor.nextInt();
		
		if (num == 1) {
			diaDaSemana = "Domingo";
			
		} else if (num == 2) {
			diaDaSemana = "Segunda-feira";
			
		} else if (num == 3) {
			diaDaSemana = "Terça-feira";
			
		} else if (num == 4) {
			diaDaSemana = "Quarta-feira";
			
		} else if (num == 5) {
			diaDaSemana = "Quinta-feira";
			
		} else if (num == 6) {
			diaDaSemana = "Sexta-feira";
			
		} else if (num == 7) {
			diaDaSemana = "Sábado";
			
		} else {
			diaDaSemana = "Número inválido.";
		}
		
		System.out.println(diaDaSemana);
		leitor.close();
		
	}

}
