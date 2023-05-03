package respostas;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String res;
		
		System.out.println("Digite o nome da pessoa: ");
		String nomeDaPessoa = leitor.next();
		
		System.out.println("Digite a altura da pessoa em metros: ");
		float altura = leitor.nextFloat();
		
		if(altura >= 1.7) {
			res = "alta";
		} else {
			res = "baixa";
		}
		
		
		System.out.println(nomeDaPessoa + " é uma pessoa " + res);
		leitor.close();
	}

}
