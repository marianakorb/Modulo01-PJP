package questoes;

public class MaiorDeDoisNumeros {
	
	private double primNum;
	private double segNum;
	
	// Construtor sem parametro
	public MaiorDeDoisNumeros() {
		primNum = 0;
		primNum = 0;
		System.out.println("Construtor sem parametro: " + primNum + " e " + segNum);
	}
	
	// Construtor com parametro
	public MaiorDeDoisNumeros(double n1, double n2) {
		primNum = n1;
		segNum = n2;
		System.out.println("Construtor com parametro: " + primNum + " e " + segNum);
	}
	
	public void setPrimNum(double n1) {
		primNum = n1;
		System.out.println("n1 set: " + n1);
	}
	
	public void setSegNum(double n2) {
		segNum = n2;
		System.out.println("n2 set: " + n2);
	}
	
	public double getPrimNum() {
		return primNum;
	}
	
	public double getSegNum() {
		return segNum;
	}
	
	public void verificarMaior() {
		if(primNum >= segNum) {
			System.out.println("O número num1 é maior ou igual a num2");
		} else {
			System.out.println("O número num2 é maior que num1");
		}
	}
}
