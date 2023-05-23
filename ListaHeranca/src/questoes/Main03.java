package questoes;

public class Main03 {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado();
		
		e1.setNome("Mariana");
		e1.setEndereco("Avenida x");
		e1.setTelefone("686974654654");
		e1.setCodigoSetor(1);
		e1.setSalarioBase(1700.0);
		e1.setImposto(0.05);
		e1.calculaSalario();
		System.out.println( e1.toString() );
	}

}
