package questoes;

public class Main02 {

	public static void main(String[] args) {
		
		TestaNumero n = new TestaNumero(2);
		
		TestaNumero num = new TestaNumero();
		
		num.setNum(7);
		
		double numero = num.getNum();
		System.out.println("num get: " + numero);
		
		num.testar();
	}

}
