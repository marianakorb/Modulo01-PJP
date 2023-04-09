package exercicios;

public class VotoFacultativo {

	public static void main(String[] args) {
		int idade = 15;
		
		if (idade >= 16 && idade < 18 || idade > 70) {
			System.out.println("Voto facultativo.");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatório!");
		} else {
			System.out.println("Não pode votar");
		}
	}

}
