
public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	public void setTime(int hora, int minu){
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}
	public void setTime(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}
	public void setTime() {
		this.hora = 0;
		this.minu = 0;
		this.segu = 0;
	}
	
	public String exibirHoraUniversal() {
		return formataDig(hora) + ":" + formataDig(minu) + ":" + formataDig(segu);
	}
	public String exibirHoraPadrao() {
		String res, sufixo;
		if (hora == 0) {
			res = "12";
			sufixo = " AM";
		}
		else if (hora == 12) {
			res = "12";
			sufixo = " PM";
		}
		else if (hora >= 1 && hora <= 11) {
			res = formataDig(hora);
			sufixo = " AM";
		}
		else {
			res = formataDig(hora - 12);
			sufixo = " PM";
		}
		return res + ":" + formataDig(minu) + ":" + formataDig(segu) + sufixo;
	}
	
	private String formataDig(int valor) {
		if (valor < 10) {
			return "0"+valor;
		}
		return ""+valor;
		//return (valor < 10)? "0"+valor : ""+valor;
	}
	
	

}
