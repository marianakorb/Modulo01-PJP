package lista;

public class TestaNumero {
	
	double num;
	
	void testar() {
		
		if (this.num == 0) {
			  System.out.println("O número é zero.");
		} else if (this.num > 0) {
			System.out.println("O número é positivo.");
		} else {
			System.out.println("O número é negativo.");
		}
	}
}
