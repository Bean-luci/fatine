package App;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import Helppers.XML;
import Model.Adresse;

public class App {

	public static void main(String[] args) {
		
		Adresse adresse = new Adresse ("Ypres", "Strasbourg",67000);
		Adresse adresse2 = new Adresse ("Rome", "Strasbourg",67000);
		
			ArrayList<Adresse> list = new ArrayList<Adresse>();
			
			list.add(adresse);
			list.add(adresse2);
			
			try {
				XML.encodeToFile (adresse,"Export/adresse.xml");
				Adresse adresseLue = (Adresse)XML.decodeFromFile("Export/adresse.xml");
				
				System.out.println(adresseLue);
				
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			}
		
		
	}

}
