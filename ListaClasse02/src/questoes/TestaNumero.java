package questoes;

public class TestaNumero {
	
	private double num;
	
	// construtor sem parametro
	public TestaNumero() {
		num = 0;
		System.out.println("Construtor sem parametro: " + num);
	}
	
	// construtor com parametro
	public TestaNumero(double n) {
		num = n;
		System.out.println("Construtor com parametro: " + num);
	}
	
	public void setNum(double n) {
		num = n;
		System.out.println("num set: " + num);
	}
	
	public double getNum() {
		return num;
	}
	
	public void testar() {
		
		if (num > 0) {
			System.out.println("POSITIVO");
		} else if(num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("ZERO");
		}
	}
}
