package lista;

public class MaiorDeDoisNumeros {
	
	double num1;
	double num2;
	
	void maiorOuIgual() {
		if (this.num1 >= this.num2) {
			System.out.println(this.num1 + " é maior ou igual a " + this.num2);
			
		} else if (this.num2 > this.num1) {
			System.out.println(this.num2 + " é maior do que " + this.num1);
		}
	}
}
