package Helppers;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XML {
	
	public static void encodeToFile(Object obj, String path) throws FileNotFoundException {
		
		XMLEncoder encoder= new XMLEncoder(new FileOutputStream(path));
		
		encoder.writeObject(obj);
		
		encoder.flush();
		
		encoder.close();
		
		
	}
	
	public static Object decodeFromFile(String path) throws FileNotFoundException {
		
		Object obj = null;
		XMLDecoder decoder= new XMLDecoder(new FileInputStream(path));

		obj = decoder.readObject();
		decoder.close();
		
		return obj;
	}
	
	

}
