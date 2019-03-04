package Employe;

public abstract class Employe {
  private String ad;
  private String soyad;
  
  public Employe(String ad,String soyad){
	  setAd(ad);
	  setSoyad(soyad);
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


public abstract int hesabla();
}
