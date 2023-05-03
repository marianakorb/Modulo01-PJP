package respostas;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		 System.out.println("Digite o ano inicial: ");
		 int inicio = leitor.nextInt(); 
		 
		 System.out.println("Digite o ano final: ");
		 int fim = leitor.nextInt();
		 
		 System.out.println("Digite o espaçamento: ");
		 int espaco = leitor.nextInt();
		 
		 for (int i = inicio; i <= fim; i = i + espaco) {
			 System.out.println(i);
		 }
		 
		 leitor.close();

	}

}
