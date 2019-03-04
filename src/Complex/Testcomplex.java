package Complex;

public class Testcomplex {

	public static void main(String[] args) {
		Complex comp1=new Complex();
		Complex comp2=new Complex();
		Complex comp3=new Complex(); // result ucun
		
		
		
		comp1.setRealPart(5);
		comp1.setImaginaryPart(2);
		
		comp2.setRealPart(3);
		comp2.setImaginaryPart(7);
		
		System.out.println("COMP1: " + comp1);
		System.out.println("COMP2: " + comp2);
		
		comp3 = Complex.Topla(comp1, comp2);
		System.out.println("Toplama: " + comp3);

		comp3=Complex.Cix(comp1,comp2);
        System.out.println(comp3);
        
        comp3=Complex.vur(comp1, comp2);
        
        System.out.println(comp3);
	}

}
