package alqoritm;

public class rekursiv {

	public static void main(String[] args) {
		System.out.println(rekiursiv(5));

	}

	public static int rekiursiv(int rek){
//		int sum=0;
//		if(rek!=0){
//		sum=sum+rek*rek+rekiursiv(rek-1);
		if(rek!=0){
		return (rek*rek+rekiursiv(rek-1));	
		}
		return 0;
	}
	
}
