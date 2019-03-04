package Employe;

public class HourlyEmploye extends Employe {
	private int saat;
	private int maas;
	
	public HourlyEmploye(String ad, String soyad,int saat,int maas) {
		super(ad, soyad);
		setSaat(saat);
		setMaas(maas);
	}

	
	
	

	@Override
	public String toString() {
		return "HourlyEmploye [getSaat()=" + getSaat() + ", getMaas()=" + getMaas() + ", hesabla()=" + hesabla()
				+ ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + "]";
	}





	public int getSaat() {
		return saat;
	}

	public void setSaat(int saat) {
		this.saat = saat;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	@Override
	public int hesabla() {
	
		return getSaat()*getMaas();
	}

}
