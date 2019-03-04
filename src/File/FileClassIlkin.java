package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FileClassIlkin {

	public static void main(String[] args) throws IOException {
		 String[] array=null;
		 String setr;
		 ArrayList<Integer> arlist=new ArrayList<Integer>();
		 int a;
		File file3=null;
		File file4=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		FileReader fr=null;
		BufferedReader br=null;

         try{
        	file3=new File("C:/Users/User/Desktop/java/file3.txt");
        	file4 =new File("C:/Users/User/Desktop/java/file4.txt");
        	fr=new FileReader(file3);
        	br=new BufferedReader(fr);
        	
        	fw=new FileWriter(file4);
        	bw=new BufferedWriter(fw);
        	
         }catch (Exception e) {
			// TODO: handle exception
        	 System.out.println("Fayl problemi");
		}
         
     	while((setr=br.readLine())!=null){
     	try{
     		 a=Integer.parseInt(setr);
     	//	 System.out.println("int "+a);
     		arlist.add(a);
     	System.out.println(setr);
     	//System.out.println(arlist);
     	
         	 
      } catch (Exception e) {
			System.out.println("yazilis sehvi: " + setr);
		}
          }
     	
     	System.out.println("******");
     	
     	Collections.sort(arlist);
     	
     	System.out.println(arlist);
     	
     	 br.close();
     	fr.close();
     	 bw.close();
      	fw.close();
		
		
	
	}
	}



