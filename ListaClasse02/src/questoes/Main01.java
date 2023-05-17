package questoes;

public class Main01 {

	public static void main(String[] args) {
		
		MaiorDeDoisNumeros numeros = new MaiorDeDoisNumeros(1, 2);
		
		MaiorDeDoisNumeros num = new MaiorDeDoisNumeros();
		
		num.setPrimNum(6);
		num.setSegNum(4);
		
		double num1 = num.getPrimNum();
		double num2 = num.getSegNum();
		System.out.println("n1 get: " + num1 + ", n2 get: " + num2);
		
		num.verificarMaior();
	}

}
