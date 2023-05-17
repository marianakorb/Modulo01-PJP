package questoes;

public class PrimeiroQuadrilatero {
	
	private double largura;
	private double altura;
	
	public PrimeiroQuadrilatero() {
		largura = 0;
		altura = 0;
		System.out.println("Construtor sem parametro: " + largura + " e " + altura);
	}
	
	public PrimeiroQuadrilatero(double l, double a) {
		if(l > 0) {
			largura = l;
			System.out.println("Construtor com parametro largura: " + largura);
		} else {
			largura = 0;
			System.out.println("Valor inválido para o atributo largura. Inicializando com zero.");
		}
		
		if(a > 0) {
			altura = a;
			System.out.println("Construtor com parametro altura: " + altura);
		} else {
			altura = 0;
			System.out.println("Valor inválido para o atributo altura. Inicializando com zero.");
		}
		
		if(l > 0 && a > 0) {
			calculaPerimetro(l,  a);
		}
	}
	
	public void setLargura(double l) {
		if(l > 0) {
			largura = l;
			System.out.println("Largura set: " +  largura);
		} else {
			largura = 0;
			System.out.println("Valor inválido para o atributo largura. Inicializando com zero.");
		}
	}
	
	public void setAltura(double a) {
		if(a > 0) {
			altura = a;
			System.out.println("Altura set: " + altura);
		} else {
			altura = 0;
			System.out.println("Valor inválido para o atributo altura. Inicializando com zero.");
		}
	}
	
	public double getLargura() {
		return largura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void calculaPerimetro(double l, double a) {
		double perimetro;
		if (l > 0 && a > 0) {
			
			perimetro = 2 * (l + a);
			System.out.println("Perímetro: " +  perimetro);
		}
	}
}







