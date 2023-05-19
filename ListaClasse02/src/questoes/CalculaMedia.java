package questoes;

public class CalculaMedia {
	
	private double nota1;
	private double nota2;
	private double nota3;
	
	// construtor sem parametros
	public CalculaMedia() {
		this.nota1 = 0;
		this.nota2 = 0;
		this.nota3 = 0;
		System.out.println("Construtor sem parametro: " + this.nota1 + ", " + this.nota2 + ", " + this.nota3);
	}
	
	// construtor com parametros
	public CalculaMedia(double n1, double n2, double n3) {
		if (n1 >= 0 && n1 <= 10 ) {
			this.nota1 = n1;
		} else {
			this.nota1 = 0;
		}
		
		if (n2 >= 0 && n2 <= 10 ) {
			this.nota2 = n2;
		} else {
			this.nota2 = 0;
		}
		
		if (n3 >= 0 && n3 <= 10 ) {
			this.nota3 = n3;
		} else {
			this.nota3 = 0;
		}
		
		System.out.println("Construtor com parametro: " + this.nota1 + ", " + this.nota2 + ", " + this.nota3);
	}
	
	public void setNota1(double n1) {
		if (n1 >= 0 && n1 <= 10 ) {
			this.nota1 = n1;
		} else {
			this.nota1 = 0;
		}
		
		System.out.println("nota1 set: " + this.nota1);
	}
	
	public void setNota2(double n2) {
		if (n2 >= 0 && n2 <= 10 ) {
			this.nota2 = n2;
		} else {
			this.nota2 = 0;
		}
		
		System.out.println("nota2 set: " + this.nota2);
	}
	
	
	public void setNota3(double n3) {
		if (n3 >= 0 && n3 <= 10 ) {
			this.nota3 = n3;
		} else {
			this.nota3 = 0;
		}
		
		System.out.println("nota3 set: " + this.nota3);
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public double getNota3() {
		return this.nota3;
	}
	
	
	public void calculaMedia() {
		double media;
		media = (this.nota1 + this.nota2 + this.nota3) / 3;
		
		System.out.printf("Média: %.2f", media);
	}
	
	
}



