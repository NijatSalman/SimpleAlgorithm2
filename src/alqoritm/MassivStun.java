package alqoritm;
public class MassivStun {
	public static void main(String[] args) {
		int k=0;
		int massiv [][]={
				{4,5,6},
				{1,18,7},
				{8,9,3},
				{10,2,13}
		};
		for(int i=0;i<massiv.length-1;i++){
			int enkicik=Integer.MAX_VALUE;
			int enboyuk=Integer.MIN_VALUE;
			for(int j=0;j<massiv.length;j++){
				if(enkicik>massiv[j][i]){
					enkicik=massiv[j][i];
				}
				if(enboyuk<massiv[j][i]){
					enboyuk=massiv[j][i];
				}
			}
			k++;
			System.out.println("massivin"+k+"ci stununda en kicik ededi="+enkicik);
			System.out.println("massivin"+k+"ci stununda en boyuk ededi="+enboyuk);
		}
	}
}
