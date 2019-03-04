package Sirala;

public class BubbleSort {

	public static void main(String[] args) {
		//int [] massiv={5,2,8,3,1};
		int [] massiv={20,12,11,5,3,1,0};
		int size=massiv.length;
		int tmp;
		for(int j=0;j<size-1;j++){
		for(int i=0;i<size-1;i++){
			if(massiv[i]>massiv[i+1]){
				tmp=massiv[i];
				massiv[i]=massiv[i+1];
				massiv[i+1]=tmp;
			}
		
		}
		}
		
		for (int item : massiv) {
			System.out.println(item);
		}
	
	}

}
