package alqoritm;

public class barray {
	
	public static void main(String[] args) {
		int i,j;
		int k=0;
		int [] massiv2=new int[2];
	    int [][] massiv={
	    		{2,8},
	    		{1,3},
	    		{5,7},
	    		{2,4},
	    		{3,6},
	    		{1,4},
	    		{3,8},
	    		{2,5},
	    		{2,8},
	    		{6,9},
	    		{9,10}};
	     for(i=0;i<massiv.length;i++){

	    		if(massiv[i][0]<=5 && 5<=massiv[i][1]){
	    			k++;
	    		} 
	     }
	     System.out.println(k);
	     System.out.println(massiv[0].length);
	}

}
