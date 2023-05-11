package lista;

public class PrimeiroQuadrilatero {
	
	double largura;
	double altura;
	
	void calculaPerimetro() {
		double perimetro;
		
		perimetro = 2 * (this.largura + this.altura);
		
		System.out.println("Valor do perimetro: " + perimetro);
	}
}
