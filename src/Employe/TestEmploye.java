package Employe;

import java.util.ArrayList;

public class TestEmploye {

	public static void main(String[] args) {
	
		SalariedEmploye emps=new SalariedEmploye("Ilkin","Memmedzade",100);
		CommissionEmploye empc=new CommissionEmploye("Nuran", "Abasov", 5000, 15);
		HourlyEmploye emph=new HourlyEmploye("Orxan","Cebrayilov", 700, 25);
		
		Employe [] array = new Employe[3];
		
		ArrayList<Employe> alist = new ArrayList<Employe>();
		
		array[0] = emps;
		array[1] = empc;
		array[2] = emph;
		
		alist.add(emps);
		alist.add(empc);
		alist.add(emph);
		
		
//		for (Employe employe : array) {
//			System.out.println(employe);
//		}
		
		for (Employe employe : alist) {
			System.out.println(employe);
		}
		

	}

}
