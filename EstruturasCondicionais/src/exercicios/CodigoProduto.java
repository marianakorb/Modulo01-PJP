package exercicios;

public class CodigoProduto {

	public static void main(String[] args) {
		int codigoProduto = 0;
		
		switch (codigoProduto) {
			case 1:
				System.out.println("Alimento não-perecível");
				break;
			case 2:
				System.out.println("Alimento perecível");
				break;
			case 3:
				System.out.println("Vestuário");
				break;
			case 4: 
				System.out.println("Limpeza");
				break;
			default: 
				System.out.println("Opção Inválida");
		}
	}

}
