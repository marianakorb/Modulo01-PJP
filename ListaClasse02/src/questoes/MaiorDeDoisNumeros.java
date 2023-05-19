package questoes;

public class MaiorDeDoisNumeros {
	
	private double primNum;
	private double segNum;
	
	// Construtor sem parametro
	public MaiorDeDoisNumeros() {
		this.primNum = 0;
		this.segNum = 0;
		System.out.println("Construtor sem parametro: " + this.primNum + " e " + this.segNum);
	}
	
	// Construtor com parametro
	public MaiorDeDoisNumeros(double n1, double n2) {
		this.primNum = n1;
		this.segNum = n2;
		System.out.println("Construtor com parametro: " + this.primNum + " e " + this.segNum);
	}
	
	public void setPrimNum(double n1) {
		this.primNum = n1;
		System.out.println("n1 set: " + this.primNum);
	}
	
	public void setSegNum(double n2) {
		this.segNum = n2;
		System.out.println("n2 set: " + this.segNum);
	}
	
	public double getPrimNum() {
		return this.primNum;
	}
	
	public double getSegNum() {
		return this.segNum;
	}
	
	public void verificarMaior() {
		if(this.primNum >= this.segNum) {
			System.out.println("O número num1 é maior ou igual a num2");
		} else {
			System.out.println("O número num2 é maior que num1");
		}
	}
}
