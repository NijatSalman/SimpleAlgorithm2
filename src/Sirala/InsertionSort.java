package Sirala;

public class InsertionSort {

	public static void main(String[] args) {
		int [] massiv={10,9,9,8,-1,7,6,5,0,4,3,2,1,1,0,0};
		int size=massiv.length;
		int tmp;
		for(int j=0;j<size-1;j++){
           for (int i = 0; i < size-1; i++) {
			 if(massiv[i]>massiv[i+1]){
				tmp=massiv[i];
				massiv[i]=massiv[i+1];
				massiv[i+1]=tmp;
				if(massiv[i]>massiv[i+1]){
					tmp=massiv[i];
					massiv[i]=massiv[i+1];
					massiv[i+1]=tmp;
				}
			 } 
		}
     }
           for (int item : massiv) {
			System.out.println(item);
		}
           
	}

}
