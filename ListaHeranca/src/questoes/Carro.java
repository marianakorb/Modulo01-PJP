package questoes;

public class Carro extends Veiculo {
	
	private int numDePortas;
	private String tipoCombustivel;
	
	public Carro() {
		this.numDePortas = 0;
		this.tipoCombustivel = "";
	}

	public int getNumDePortas() {
		return numDePortas;
	}

	public void setNumDePortas(int numDePortas) {
		this.numDePortas = numDePortas;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	@Override
	public String toString() {
		String info = "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo() +
				"\n" + "Ano: " + getAno() + "\n" + "Némero de portas: " + getNumDePortas()
				+ "\n" + "Tipo de Combustível: " + getTipoCombustivel();
		
		return info;
	}
}
