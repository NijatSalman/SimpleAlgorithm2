
public class Insan {
	
	private String ad;
	private String soyad;
	private int yas;
	
	public Insan(){
		
	}
	public Insan(String ad,String soyad){
		setAd(ad);
		setSoyad(soyad);

	}
	
	public Insan(String ad,String soyad,int yas){
		setAd(ad);
		setSoyad(soyad);
		setYas(yas);
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	@Override
	public String toString() {
		return ad+" "+" "+soyad+" "+yas;
	}


}
