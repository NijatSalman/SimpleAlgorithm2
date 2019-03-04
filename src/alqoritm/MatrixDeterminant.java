package alqoritm;

public class MatrixDeterminant {

	public static void main(String[] args) {	
		int i,j,k,d;
		int deta;
		int a=1;
		int massiv [][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(i=0;i<massiv.length;i++){
			for(j=0;j<massiv.length;j++){
				
				for(k=0;k<massiv.length;k++){
				if(k!=i){
					for(d=0;d<massiv.length;d++){
						if(d!=j){
							 a=a*massiv[k][d];
						}
						break;
					}
				}
			}	
			
		}
			
     }
		

	}

}
