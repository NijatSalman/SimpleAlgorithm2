package Complex;

public class Complex {
	
	public Complex(){
		
	}

	private float realPart;
	private float imaginaryPart;
	
	public static Complex Topla(Complex aaa,Complex bbb){
	
		Complex ccc = new Complex();
		
		ccc.setRealPart(aaa.getRealPart()+bbb.getRealPart());
		ccc.setImaginaryPart(aaa.getImaginaryPart()+bbb.getImaginaryPart());
		
		return ccc;
	}
	
	public static Complex Cix(Complex a,Complex b){
		Complex zzz=new Complex();
		
		zzz.setRealPart(a.getRealPart()-b.getRealPart());
	    zzz.setImaginaryPart(a.getImaginaryPart()-b.getImaginaryPart());
	    return zzz;
	}
	
	
	public static Complex vur(Complex q1,Complex q2){
	Complex sss=new Complex ();
	
	sss.setRealPart(q1.getRealPart()*q2.getRealPart()-q1.getImaginaryPart()*q2.getImaginaryPart());
    sss.setImaginaryPart(q1.getRealPart()*q2.getImaginaryPart()+q1.getImaginaryPart()*q2.getRealPart());
//	sss.setRealPart(q1.getImaginaryPart()*q2.getRealPart());
//	sss.setImaginaryPart(q1.getImaginaryPart()*q2.getImaginaryPart());
	
	return sss;
	
	}
	
	
	
	public float getRealPart() {
		return realPart;
	
	}
	public void setRealPart(float realPart) {
		this.realPart = realPart;
	}
	public float getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(float imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}




	@Override
	public String toString() {
		return getRealPart() + " + " + getImaginaryPart() + "i";
	}

	
}
