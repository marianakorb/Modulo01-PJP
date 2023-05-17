package questoes;

public class Main04 {

	public static void main(String[] args) {
		
		CalculaMedia notas = new CalculaMedia(1, 6, 10);
		
		CalculaMedia nota = new CalculaMedia();
		
		nota.setNota1(10);
		nota.setNota2(5);
		nota.setNota3(9);
		
		double n1 = nota.getNota1();
		double n2 = nota.getNota2();
		double n3 = nota.getNota3();
		
		System.out.println("Nota1 get: " + n1 + ", Nota2 get " + n2 + ", Nota3 get: " + n3);
		
		nota.calculaMedia();
	}

}
