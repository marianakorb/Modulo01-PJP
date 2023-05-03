package respostas;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String res;
		
		System.out.println("Digite o comprimento do retângulo: ");
		float comprimento = leitor.nextFloat();
		
		System.out.println("Digite a largura do retângulo: ");
		float largura = leitor.nextFloat();
		
		if (comprimento == largura) {
			res = "É quadrado";
		} else {
			res = "Não é quadrado";
		}
		
		System.out.println(res);
		
		leitor.close();
	}

}
