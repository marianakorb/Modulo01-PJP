package exercicios;

public class SituacaoAluno {

	public static void main(String[] args) {
		String nomeAluno = "Pedro";
		int media = 9;
		
		if (media >= 9) {
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
