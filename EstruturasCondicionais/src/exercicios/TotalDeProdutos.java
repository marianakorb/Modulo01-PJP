package exercicios;

public class TotalDeProdutos {

	public static void main(String[] args) {
		int produto = 5;
		double quantidade = 4.5;
		double totalVendidos;
		
		switch (produto) {
			case 1: 
				totalVendidos = quantidade * 2.95;
				System.out.println("Total de produtos vendidos: R$ " + totalVendidos);
				break;
			case 2:
				totalVendidos = quantidade * 4.5;
				System.out.println("Total de produtos vendidos: R$ " + totalVendidos);
				break;
			case 3:
				totalVendidos = quantidade * 9.98;
				System.out.println("Total de produtos vendidos: R$ " + totalVendidos);
				break;
			case 4:
				totalVendidos = quantidade * 4.49;
				System.out.println("Total de produtos vendidos: R$ " + totalVendidos);
				break;
			case 5:	
				totalVendidos = quantidade * 6.87;
				System.out.println("Total de produtos vendidos: R$ " + totalVendidos);
				break;
			default:
				System.out.println("Produto inválido");
				
		}
	

	}

}
