package _05_Abstraction;

public class Cercle extends Shape {

	private int rayon;
	
	public int getRayon() {
		return rayon;
	}
	
	
	
	public void setRayon(int rayon) {
		
		if (rayon>=0) {
		
		this.rayon = rayon;
	}
		else {
			throw new IllegalArgumentException("le rayon du cercle doit ?tre positif");
		}	
		this.rayon = rayon;
	}



	public Cercle(int rayon) {
		super();
		this.rayon = rayon;
	}

	public double surface() {
        // TODO Auto-generated method stub
        return Math.round (rayon * rayon * Math.PI*100)/100.0;
    }

	

}
