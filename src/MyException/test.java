package MyException;

import java.io.IOException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int [5];

		try {
			System.out.println(array[5]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("arrayin boyutunu tasti");
		}
		
		
	}

}
