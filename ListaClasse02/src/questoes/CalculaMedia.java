package questoes;

public class CalculaMedia {
	
	private double nota1;
	private double nota2;
	private double nota3;
	
	// construtor sem parametros
	public CalculaMedia() {
		nota1 = 0;
		nota2 = 0;
		nota3 = 0;
		System.out.println("Construtor sem parametro: " + nota1 + ", " + nota2 + ", " + nota3);
	}
	
	// construtor com parametros
	public CalculaMedia(double n1, double n2, double n3) {
		if (n1 >= 0 && n1 <= 10 ) {
			nota1 = n1;
		} else {
			nota1 = 0;
		}
		
		if (n2 >= 0 && n2 <= 10 ) {
			nota2 = n2;
		} else {
			nota2 = 0;
		}
		
		if (n3 >= 0 && n3 <= 10 ) {
			nota3 = n3;
		} else {
			nota3 = 0;
		}
		
		System.out.println("Construtor com parametro: " + nota1 + ", " + nota2 + ", " + nota3);
	}
	
	public void setNota1(double n1) {
		if (n1 >= 0 && n1 <= 10 ) {
			nota1 = n1;
		} else {
			nota1 = 0;
		}
		
		System.out.println("nota1 set: " + nota1);
	}
	
	public void setNota2(double n2) {
		if (n2 >= 0 && n2 <= 10 ) {
			nota2 = n2;
		} else {
			nota2 = 0;
		}
		
		System.out.println("nota2 set: " + nota2);
	}
	
	
	public void setNota3(double n3) {
		if (n3 >= 0 && n3 <= 10 ) {
			nota3 = n3;
		} else {
			nota3 = 0;
		}
		
		System.out.println("nota3 set: " + nota3);
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public double getNota3() {
		return nota3;
	}
	
	
	public void calculaMedia() {
		double media;
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("Média: %.2f", media);
	}
	
	
}



