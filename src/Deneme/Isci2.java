package Deneme;

public class Isci2 extends Isci {
	private int xmaas;
	public Isci2(String ad, String soyad, int sexsiyyet, int faiz, int gelir,int xmaas) {
		super(ad, soyad, sexsiyyet, faiz, gelir);
		setXmaas(xmaas);
	}
   @Override
	public String toString() {
		return "Isci2 [xmaas=" + xmaas + super.toString() ;
				
   }

   
	public int getXmaas() {
	return xmaas;
}
public void setXmaas(int xmaas) {
	this.xmaas = xmaas;
}

	public int hesabla2(){
		return super.hesapla()+getXmaas();
		
	}
	
}
