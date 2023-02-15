
public class TimeTeste {
	public static void main(String[] args) {
		
		Time t = new Time();
		t.setTime(2, 8, 18);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		t.setTime(15, 7, 9);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		t.setTime(12);
		
	}

}
