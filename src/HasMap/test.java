package HasMap;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		Insan ilkin=new Insan("Ilkin", "Memmedzade",23);
		Insan nicat=new Insan("Nicat", "Salmanov",19);
		Insan sahib=new Insan("Sahib", "Zulfuqarov",23);
		Insan nuran=new Insan("Nuran", "Abasov",26);
		Insan orxan=new Insan("Orxan", "Cebrayilov",24);
		
	
		HashMap<Integer, Insan> hmap = new HashMap<Integer, Insan>();
		hmap.put(1, ilkin);
		hmap.put(2, nicat);
		hmap.put(3, sahib);
		hmap.put(4, nuran);
		hmap.put(5, orxan);
		
		System.out.println(hmap.get(5));
		System.out.println(sahib);
	}

}
