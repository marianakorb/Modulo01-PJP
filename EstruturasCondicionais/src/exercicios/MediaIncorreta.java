package exercicios;

public class MediaIncorreta {

	public static void main(String[] args) {
		String nomeAluno = "Pedro";
		int media = 8;
		
		if (media > 10) {
			System.out.println("Valor de Média Final Incorreto!");
		} else if (media >= 9) {
			System.out.println("Aluno: " + nomeAluno + " Aprovado com conceito Exelente.");
		} else if (media >= 7 && media < 9) {
			System.out.println("Aluno: " + nomeAluno + " Aprovado com conceito Bom.");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno: " + nomeAluno + " Aprovado com conceito Regular.");
		} else {
			System.out.println("Aluno: " + nomeAluno + " Reprovado.");
		}
	}

}
