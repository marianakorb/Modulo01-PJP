package exercicios;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		int x;
		int y;
		
		do {
			System.out.println("Digite a coordenada X: ");
			x = leitor.nextInt();
			
			System.out.println("Digite a coordenada Y: "); 
			y = leitor.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("1° Quadrante");
				
			} else if (x < 0 && y > 0) {
				System.out.println("2° Quadrante");
				
			} else if (x < 0 && y < 0) {
				System.out.println("3° Quadrante");
				
			} else if (x > 0 && y < 0) {
				System.out.println("4° Quadrante");
				
			} else {
				break;
			}
			
		} while(x == 0 || y == 0);
	}

}