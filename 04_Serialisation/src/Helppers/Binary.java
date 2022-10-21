package Helppers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Binary {

public static void encodeToFile(Object obj, String path) throws IOException {
		
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutput oos= new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		
		oos.close();
		fos.close();
	
		
		
	}
	
	public static Object decodeFromFile(String path) throws ClassNotFoundException, IOException {
		
		Object obj= null;
		
		FileInputStream fis= new FileInputStream(path);
		
		ObjectInput ois = new ObjectInputStream(fis);
		
		obj= ois.readObject();
		
		ois.close();
		fis.close();
		
		return obj;
	}
	
	
	
}
