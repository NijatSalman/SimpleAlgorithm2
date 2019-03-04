package Deneme;

public class Insan {

	
	private String ad;
	private String soyad;
	private int yas;
	
	public static int say;

	
	
	public Insan(String ad, String soyad, int yas) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Insan [ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + "] insan SAY: " + say;
	}
}
