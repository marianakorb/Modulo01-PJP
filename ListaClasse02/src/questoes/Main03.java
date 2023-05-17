package questoes;

public class Main03 {

	public static void main(String[] args) {
		
		PrimeiroQuadrilatero medidas = new PrimeiroQuadrilatero(5, 2);
		
		PrimeiroQuadrilatero medida = new PrimeiroQuadrilatero();
		
		medida.setAltura(9);
		medida.setLargura(3);
		
		double altura = medida.getAltura();
		double largura = medida.getLargura();
		System.out.println("Altura get: " + altura);
		System.out.println("Largura get: " +  largura);
		
		medida.calculaPerimetro(largura, altura);
	}

}
