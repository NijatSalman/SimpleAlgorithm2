package Deneme;

public class localglobalstatictest {

	static int a =5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=6;
		
		System.out.println(a);
		
		yazdir(9);
		
		yazdir();
		
	}
	
public static void yazdir(){
		
		System.out.println(a);
		
	}
	
	public static void yazdir(int a){
		
		System.out.println(a);
		
	}

}
