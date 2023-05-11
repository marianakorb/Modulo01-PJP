package lista;

public class Calculadora {
	
	double num1;
	double num2;
	
	void somar() {
		double resultado;
		resultado = this.num1 + this.num2;
		System.out.println("Soma: " + resultado);
	}
	
	void subtrair() {
		double resultado;
		resultado = this.num1 - this.num2;
		System.out.println("Subtração: " + resultado);
	}
}
