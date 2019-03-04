package Employe;

public class SalariedEmploye extends Employe {
	private int maas;
	
public SalariedEmploye(String ad, String soyad,int maas) {
		super(ad, soyad);
		setMaas(maas);
}

	public int getMaas() {
	return maas;
}

public void setMaas(int maas) {
	this.maas = maas;
}

	@Override
	public int hesabla() {
		return getMaas();
	}

	@Override
	public String toString() {
		return "SalariedEmploye [getMaas()=" + getMaas() + ", hesabla()=" + hesabla() + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + "]";
	}

}
