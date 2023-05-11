package lista;

public class CalculaMedia {
	
	double nota1;
	double nota2;
	double nota3;
	
	void calculaMedia() {
		double media;
		media = (this.nota1 + this.nota2 + this.nota3) / 3;
		System.out.print("Média calculada: " +  media);
	}
}
