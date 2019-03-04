package Deneme;

public class Isci {
	
	
  
private String ad;
   private String soyad;
   private int sexsiyyet;
   private  int faiz;
   private  int gelir;
   
   
   
   public Isci(String ad,String soyad,int sexsiyyet,int faiz,int gelir){
	   
	   setAd(ad);
	   setSoyad(soyad);
	   setSexsiyyet(sexsiyyet);
	   setFaiz(faiz);
	   setGelir(gelir);	  
   }
   
   public int hesapla(){
	   
	   return (getGelir()*getFaiz())/100;
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
public int getSexsiyyet() {
	return sexsiyyet;
}
public void setSexsiyyet(int sexsiyyet) {
	this.sexsiyyet = sexsiyyet;
}
public int getFaiz() {
	return faiz;
}
public void setFaiz(int faiz) {
	this.faiz = faiz;
}
public int getGelir() {
	return gelir;
}
public void setGelir(int gelir) {
	this.gelir = gelir;
}

@Override
	public String toString() {
		return "Isci [maas()=" + hesapla() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getSexsiyyet()=" + getSexsiyyet() + ", getFaiz()=" + getFaiz() + ", getGelir()=" + getGelir()
				+ "]";
	}
   
}
