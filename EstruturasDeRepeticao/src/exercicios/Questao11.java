package exercicios;

public class Questao11 {

	public static void main(String[] args) {
		
		double soma = 0;
		
		for(double i = 1; i <= 50; i++) {
			soma = soma + 1/i;
		}
		System.out.printf("%.2f", soma);
	}

}
