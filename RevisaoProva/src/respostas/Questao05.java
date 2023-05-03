package respostas;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade da primeira pessoa: ");
		int idadePrimPessoa = leitor.nextInt();
		
		System.out.println("Digite a idade da segunda pessoa: ");
		int idadeSegPessoa = leitor.nextInt();
		
		
		if (idadePrimPessoa ==  idadeSegPessoa) {
			System.out.println("As pessoas possuem a mesma idade");
			
		} else if (idadePrimPessoa > idadeSegPessoa) {
			System.out.println("A pessoa de " + idadePrimPessoa +  " anos é mais velha");
			System.out.println("E a pessoa de " + idadeSegPessoa +  " anos é mais nova");
			
		} else {
			System.out.println("A pessoa de " + idadeSegPessoa +  " anos é mais velha");
			System.out.println("E a pessoa de " + idadePrimPessoa +  " anos é mais nova");
		}
		
		leitor.close();
	}

}
