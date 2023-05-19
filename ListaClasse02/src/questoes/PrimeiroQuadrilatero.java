package questoes;

public class PrimeiroQuadrilatero {
	
	private double largura;
	private double altura;
	
	public PrimeiroQuadrilatero() {
		this.largura = 0;
		this.altura = 0;
		System.out.println("Construtor sem parametro: " + this.largura + " e " + this.altura);
	}
	
	public PrimeiroQuadrilatero(double l, double a) {
		if(l > 0) {
			this.largura = l;
			System.out.println("Construtor com parametro largura: " + this.largura);
		} else {
			this.largura = 0;
			System.out.println("Valor inválido para o atributo largura. Inicializando com zero.");
		}
		
		if(a > 0) {
			this.altura = a;
			System.out.println("Construtor com parametro altura: " + this.altura);
		} else {
			this.altura = 0;
			System.out.println("Valor inválido para o atributo altura. Inicializando com zero.");
		}
		
		if(l > 0 && a > 0) {
			calculaPerimetro(l,  a);
		}
	}
	
	public void setLargura(double l) {
		if(l > 0) {
			this.largura = l;
			System.out.println("Largura set: " +  this.largura);
		} else {
			this.largura = 0;
			System.out.println("Valor inválido para o atributo largura. Inicializando com zero.");
		}
	}
	
	public void setAltura(double a) {
		if(a > 0) {
			this.altura = a;
			System.out.println("Altura set: " + this.altura);
		} else {
			this.altura = 0;
			System.out.println("Valor inválido para o atributo altura. Inicializando com zero.");
		}
	}
	
	public double getLargura() {
		return this.largura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void calculaPerimetro(double l, double a) {
		double perimetro;
		if (l > 0 && a > 0) {
			perimetro = 2 * (l + a);
			
			System.out.println("Perímetro: " +  perimetro);
		}
	}
}







