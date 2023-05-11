package lista;

public class Televisor {
	
	String marca;
	String modelo;
	int polegadas;
	boolean ligado;
	int volume;
	int canal;
	int brilho;
	
	void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Polegadas: " + this.polegadas);
		System.out.println("Está ligado? " + this.ligado);
		System.out.println("Volume: " + this.volume);
		System.out.println("Canal: " + this.canal);
		System.out.println("Brilho: " + this.brilho);
	}
	
	void ligar() {
		this.ligado = true;
	}
	
	void desligar() {
		this.ligado = false;
	}
	
	void aumentarVolume() {
		if(this.volume < 100) {
			this.volume++;
			System.out.println("Volume: " + this.volume);
			
		}
	}
	
	void diminuirVolume() {
		if(this.volume > 0) {
			this.volume--;
			System.out.println("Volume: " + this.volume);
		}
	}
	
	void aumentarBrilho() {
		if(this.brilho < 100) {
			this.brilho++;
			System.out.println("Brilho: " + this.brilho);
			
		}
	}
	
	void diminuirBrilho() {
		if (this.brilho > 0) {
			this.brilho--;
			System.out.println("Brilho: " + this.brilho);
		}
	}
	
	
}
