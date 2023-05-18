package questoes;

public class HorarioModificada {
	
	private String hora;
	private String minutos;
	private String segundos;
	
	public HorarioModificada() {
		this.hora = "0";
		this.minutos = "0";
		this.segundos = "0";
	}
	
	public HorarioModificada(String hora, String minutos, String segundos) {
		int seg = Integer.parseInt(segundos);
		int min = Integer.parseInt(minutos);
		int hr = Integer.parseInt(hora);
		
		if (seg >= 0 && seg <= 59) {
			this.segundos = segundos;
		} else {
			this.segundos = "0";
		}
		
		if (min >= 0 && min <= 59) {
			this.minutos = minutos;
		} else {
			this.minutos = "0";
		}
		
		if (hr >= 0 && hr <= 23) {
			this.hora = hora;
		} else {
			this.hora = "0";
		}
		
		formato24Horas();
	}
	
	public void setSegundos(String segundos) {
		int seg = Integer.parseInt(segundos);

		if (seg >= 0 && seg <= 59) {
			this.segundos = segundos;
		} else {
			this.segundos = "0";
		}
		
	}
	
	public void setMinutos(String minutos) {
		int min = Integer.parseInt(minutos);

		if (min >= 0 && min <= 59) {
			this.minutos = minutos;
		} else {
			this.minutos = "0";
		}
		
	}
	
	public void setHora(String hora) {
		int hr = Integer.parseInt(hora);
		
		if (hr >= 0 && hr <= 23) {
			this.hora = hora;
		} else {
			this.hora = "0";
		}
		
	}
	
	public String getSegundos() {
		return this.segundos;
	}
	
	public String getMinutos() {
		return this.minutos;
	}
	
	public String getHora() {
		return this.hora;
	}
	
	public void formato24Horas() {
		System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);
	}
	
}





