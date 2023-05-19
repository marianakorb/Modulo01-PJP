package questoes;

public class TestaNumero {
	
	private double num;
	
	// construtor sem parametro
	public TestaNumero() {
		this.num = 0;
		System.out.println("Construtor sem parametro: " + this.num);
	}
	
	// construtor com parametro
	public TestaNumero(double n) {
		this.num = n;
		System.out.println("Construtor com parametro: " + this.num);
	}
	
	public void setNum(double n) {
		this.num = n;
		System.out.println("num set: " + this.num);
	}
	
	public double getNum() {
		return this.num;
	}
	
	public void testar() {
		
		if (this.num > 0) {
			System.out.println("POSITIVO");
		} else if(this.num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("ZERO");
		}
	}
}
