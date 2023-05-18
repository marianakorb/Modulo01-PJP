package questoes;

public class Horario {
	
	private int segundos;
	private int minutos;
	private int hora;
	
	public Horario() {
		this.segundos = 0;
		this.minutos = 0;
		this.hora = 0;
	}
	
	public Horario(int hora, int minutos, int segundos) {
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		} else {
			this.segundos = 0;
		}
		
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		} else {
			this.minutos = 0;
		}
		
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}
		
		formato24Horas();
	}
	
	public void setSegundos(int segundos) {
		
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		} else {
			this.segundos = 0;
		}
	}
	
	public void setminutos(int minutos) {
		
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		} else {
			this.minutos = 0;
		}
	}
	
	public void setHora(int hora) {

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}
	}
	
	public int getSegundos() {
		return this.segundos;
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	
	public int getHora() {
		return this.hora;
	}
	
	public void formato24Horas() {
		String seg = String.format("%02d", this.segundos);
		String min = String.format("%02d", this.minutos);
		String hr = String.format("%02d", this.hora);
		
		System.out.println(hr + ":" + min + ":" + seg);
	}
}
