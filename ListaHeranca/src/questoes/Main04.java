package questoes;

public class Main04 {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.setMarca("Fiat");
		c1.setModelo("Kwid");
		c1.setAno(2021);
		c1.setNumDePortas(4);
		c1.setTipoCombustivel("Gasolina comum");
		
		System.out.println( c1.toString() );

	}

}
