package exemplos;

public class PercorreArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Percorrendo um array com o for-each
		String[] nomes = { "João", "Maria", "Pedro" };
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		
		double[] num = {1.3, 1.4, -5.7, 8.9};
		
		for( double n: num ) {
			System.out.println(n);
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}	
	}

}
