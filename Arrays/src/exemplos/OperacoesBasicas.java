package exemplos;

import java.util.Arrays;

public class OperacoesBasicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Copiando um array
		int[] numeros = { 1, 2, 3 };
		int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);

		// Ordenando um array
		String[] nomes = { "João", "Maria", "Pedro" };
		Arrays.sort(nomes);

		// Preenchendo um array com valores específicos
		int[] numeros_2 = new int[5];
		Arrays.fill(numeros, 0);
		
		System.out.println(copiaNumeros);
		System.out.println(numeros_2);
	}

}
