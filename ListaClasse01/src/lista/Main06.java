package lista;

public class Main06 {

	public static void main(String[] args) {
		
		Televisor tv = new Televisor();
		
		tv.marca = "Samsung";
		tv.modelo = "Smart";
		tv.polegadas = 32;
		tv.ligado = false;
		tv.volume = 10;
		tv.canal = 12;
		tv.brilho = 50;
		
		tv.status();
		System.out.println("------------");
		
		tv.desligar();
		tv.ligar();
		tv.aumentarBrilho();
		tv.diminuirBrilho();
		tv.diminuirBrilho();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.diminuirVolume();
		
		System.out.println("------------");
		tv.status();
	}

}
