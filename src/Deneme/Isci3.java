package Deneme;

public class Isci3 extends Isci2 {
   private int vergi;
	public Isci3(String ad, String soyad, int sexsiyyet, int faiz, int gelir, int xmaas,int vergi) {
		super(ad, soyad, sexsiyyet, faiz, gelir, xmaas);
		setVergi(vergi);
	
	}
	
	public int getVergi() {
		return vergi;
	}
	
	public void setVergi(int vergi) {
		this.vergi = vergi;
	}

   public int xalismaas(){
	return super.hesabla2()-getVergi();
   }

@Override
public String toString() {
	return "Isci3 [getVergi()=" + getVergi() + ", xalismaas()=" + xalismaas() + super.toString()+"]";
}
   
   
   
}
