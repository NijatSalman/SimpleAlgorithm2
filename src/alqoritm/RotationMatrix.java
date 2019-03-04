package alqoritm;

public class RotationMatrix {

	public static void main(String[] args) {
		int massiv[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		for(int i=0;i<3;i++){
			int c;
			c=massiv[i][0];
			massiv[i][0]=massiv[i][2];
			massiv[i][2]=c;

		}
		System.out.println(massiv[2][0]);

	}

}
