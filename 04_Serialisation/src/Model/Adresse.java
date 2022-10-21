package Model;

import java.io.Serializable;

public class Adresse implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String voie;
	
	private String ville;
	
	private transient int codePostale;

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public Adresse(String voie, String ville, int codePostale) {
		super();
		this.voie = voie;
		this.ville = ville;
		this.codePostale = codePostale;
	}
	public Adresse() {
		super();
		
	}


	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", ville=" + ville + ", codePostale=" + codePostale + "]";
	}
	
}
