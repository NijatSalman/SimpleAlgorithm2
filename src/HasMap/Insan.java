package HasMap;

public class Insan {
      String ad;
      String soyad;
       int yas;
      
      public Insan(String ad,String soyad,int yas) {
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
		return "Insan [getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getYas()=" + getYas() + "]";
	}
	
	

}
