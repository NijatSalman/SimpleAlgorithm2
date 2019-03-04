package alqoritm;

public class Matrix {
	static int a;
	private static int d;
	private static int f;
	
	public static void main(String[] args) {
		int topla=0;
		int b = 0;
		int m=2;

		
		
		int massiv [][]={
				{5,6},
				{7,8}
		};
		
		int massiv2 [][]={
				{1,2,4},
				{3,4,6}
		};
		
		int massiv3[][]=new int [massiv.length][massiv2[0].length];
		
		for(int i=0;i<massiv.length;i++){
			for(int j=0;j<massiv2[0].length;j++){
				for(int k=0;k<massiv[0].length;k++){
				massiv3[i][j]+=massiv[i][k]*massiv2[k][j];	
				
				}
				System.out.println("massiv.lengt"+massiv.length+"massiv[0].lengt"+massiv2[0].length);
				System.out.println(massiv3[i][j]);		
			}
			
		}
	}
	
}
		
		
		
		
		
//		for(int i=0;i<massiv.length;i++){
//			 a=0;b=0;d=0;f=0;
//			for(int j=0;j<massiv.length;j++){
//				b=b+(massiv[i][j]*massiv2[j][i]);
//				for(int k=i;k<2;k++){
//				if(k!=j && k!=massiv.length-1){
//					d=massiv[i][j]*massiv2[j][j]+massiv[i][i]*massiv2[i][j];
//					massiv3[0][1]=d;
//				}
////				else{
////					f=massiv[i][j]*massiv2[j][j]+massiv[i][i]*massiv2[i][j];
////					massiv3[1][0]=f;
////				}
//					
//			     if(k!=massiv.length-1){
//					 a=a+massiv[k][j]*massiv2[j][k];
//					 massiv3[0][0]=a;
//					    }
//				}
//			}
//			 
//
//			 massiv3[1][1]=b;
//		}
//		
//    System.out.println(massiv3[0][0]);
//    System.out.println(massiv3[1][1]);
//    System.out.println(massiv3[0][1]);
////    System.out.println(massiv3[1][0]);
//	}
//
//}
//
////if(i!=j){
////a=massiv[i][j]*massiv2[i][i];
////a=massiv[j][j]*massiv2[j][i];
////} 
