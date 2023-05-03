package respostas;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double bonus;
		int novaTentativa;
		
		System.out.println("Digite seu salário: ");
		double salario = leitor.nextDouble();
		
		System.out.println("Digite seu tempo de serviço em meses: ");
		int tempoDeServico = leitor.nextInt();
		
		if (tempoDeServico >= 60) {
			bonus = salario * 5/100;
			System.out.println("Você ganhou um bônus de R$ " + bonus);
			
		} else {
			novaTentativa = 60 - tempoDeServico;
			System.out.println("Você não ganhou bônus! Tente de novo daqui " + novaTentativa + " meses");
		}
		
		leitor.close();
	}

}
