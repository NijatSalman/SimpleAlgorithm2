package Sirala;

public class SelectionSort {
	static int b=0;
	static int eki; //en kicik index
	
	public static void main(String[] args) {
		int [] massiv={10,7,5,3,1};
		int size=massiv.length;
		
	for(int i=0;i<size;i++){
		int enkicik=Integer.MAX_VALUE;
		for (int j=i;j<size;j++) {
			
			if(massiv[j]<enkicik){
				enkicik=massiv[j];
				eki = j;
			}
	    }
		//System.out.println(enkicik+" "+eki);
		enkicik = massiv[i];
		massiv[i] = massiv[eki];
		massiv[eki] = enkicik;
//		massiv[i]=massiv[i]*massiv[eki];
//		massiv[eki]=massiv[i]/massiv[eki];
//		massiv[i]=massiv[i]/massiv[eki];
		//a_eki <->
		
//		massiv[j]=massiv[j]*enkicik;
//		enkicik=massiv[j]/enkicik;
//		massiv[j]=massiv[j]/enkicik;
		//System.out.println(enkicik);
	
		
	}
	
	for (int item : massiv) {
		System.out.println(item);
	}
		
		

	}

}
