package _05_Abstraction;

public class Carre extends Shape {
	
	private int cote ; 

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}

	public Carre(int cote) {
		super();
		this.cote = cote;
	}

	@Override
	public double surface() {
		
		return cote*cote;
		
	}

	@Override
	public String toString() {
		return super.toString()+ " Je suis un carre de cote"+ cote ;
	}
	
	

}
