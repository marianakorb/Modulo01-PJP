package exercicios;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
	
		int num;
		int primInt = 0;
		int segInt = 0;
		int tercInt = 0;
		int quarInt = 0;
		
		do{
			System.out.println("Digite um número: ");
			num = leitor.nextInt();
			
			if ( (num >= 0) && (num <= 25) ) {
				primInt++;
				
			} else if ( (num >= 26) && (num <= 50) ) {
				segInt++;
				
			} else if ( (num >= 51) && (num <= 75) ) {
				tercInt++;
				
			} else if ( (num >= 76) && (num <= 100) ) {
				quarInt++;
				
			}
			
		} while (num > -1);
		
		System.out.println("Entre 0 e 25: " + primInt);
		System.out.println("Entre 26 e 50: " + segInt);
		System.out.println("Entre 51 e 75: " + tercInt);
		System.out.println("Entre 76 e 100: " + quarInt);
		
		leitor.close();
	}

}
