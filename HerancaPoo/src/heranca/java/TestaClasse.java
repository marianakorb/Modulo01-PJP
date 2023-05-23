package heranca.java;

public class TestaClasse {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Lucas", 12);
		System.out.println( pessoa1.toString() );
		System.out.println("-----");
		
		Aluno aluno1 = new Aluno("85722", "ADS", true, "Mariana", 21);
		System.out.println( aluno1.toString() );
		System.out.println("-----");
		
		Funcionario f1 = new Funcionario("RH", 1000.50, "Leandro", 45);
		System.out.println( f1.toString() );
		System.out.println("-----");
		
		Aluno a2 = new Aluno();
		a2.setNome("Maria");
		a2.setIdade(33);
		a2.setCurso("ADM");
		a2.setMatricula("1710018100");
		a2.setEstadoMatricula(true);;
		System.out.println( a2.toString() );
	}

}
