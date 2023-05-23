package questoes;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	
	public Veiculo() {
		this.marca = "";
		this.modelo = "";
		this.ano = 0;
				
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		String info = "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo() +
				"\n" + "Ano: " + getAno();
		
		return info;
	}
}
