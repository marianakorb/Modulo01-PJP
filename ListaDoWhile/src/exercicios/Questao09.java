package exercicios;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int senha; 
		
		do {
			System.out.println("Senha: ");
			senha = leitor.nextInt();
			
			if (senha != 2002) {
				System.out.println("Senha Inválida");
			} else {
				System.out.println("Acesso Permitido");
			}
			
		} while (senha != 2002);
		
		leitor.close();
	}

}
