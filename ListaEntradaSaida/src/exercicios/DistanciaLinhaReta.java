package exercicios;

public class DistanciaLinhaReta {

	public static void main(String[] args) {
		double x1 = 2.5;
		double y1 = -0.4;
		double x2 = -12.2;
		double y2 = 7;
		
		double distancia = Math.sqrt(Math.pow(x2 - (x1), 2) + Math.pow(y2 - (y1), 2));
		
		System.out.printf("Distancia(p1, p2): %.4f ", distancia);


	}

}
