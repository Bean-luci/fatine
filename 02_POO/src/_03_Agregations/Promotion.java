package _03_Agregations;

import java.util.List;

public class Promotion {
	
	List<Etudiant>etudiants;

	public Promotion(List<Etudiant> etudiants) {
		super();
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		String result= "Promotion : \n";
		
		for (Etudiant etudiant:etudiants) {
			result += "\t"+etudiant.toString()+ "\n";
		}
		
		return result;
	}

}
