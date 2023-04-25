package exemplos;

import java.util.Scanner;

public class PreenchendoArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] z = new int[5];
		for( int i = 0; i < z.length; i++ ){
			System.out.println("Print the value of z[" + i + "]");
			z[i] = s.nextInt();
		}

		s.close(); // não esqueçam de fechar o scanner
	}

}
