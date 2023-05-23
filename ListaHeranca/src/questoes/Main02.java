package questoes;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor f1 = new Fornecedor();
		f1.setEndereco("Rua y");
		f1.setNome("Lucas");
		f1.setTelefone("21985643168");
		f1.setValorCredito(2000.5);
		f1.setValorDivida(1500.0);
		System.out.println( f1.toString() );
	}

}
