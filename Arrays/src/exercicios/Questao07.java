package exercicios;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 2;
		
		String[] nomes = new String[n];
		String[] cpfs = new String[n];
		String[] ceps = new String[n];
		String[] CpfSemPontuacao = new String[n];
		String[] CepSemPontuacao = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite seu nome: ");
			nomes[i] = leitor.next();
			
			System.out.println("Digite seu CPF: ");
			cpfs[i] = leitor.next();
			
			System.out.println("Digite seu CEP: ");
			ceps[i] = leitor.next();
		}
		
		for (int i = 0; i < n; i++) {
			CpfSemPontuacao[i] = cpfs[i].replaceAll("[.-]", "");
			CepSemPontuacao[i] = ceps[i].replaceAll("[.-]", "");
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(nomes[i] + " CPF: " + CpfSemPontuacao[i] + " CEP: " + CepSemPontuacao[i]);
		}
		
		leitor.close();
	}

}
