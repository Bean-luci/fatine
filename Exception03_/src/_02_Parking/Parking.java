package _02_Parking;

public class Parking {
	
	private static int nombreDePlacesOcuppees;
	
	private int nombreDePlaces;

	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}
	
		public Parking(int nombreDePlaces ) {
			
			super();
			this.nombreDePlaces= nombreDePlaces;
			
		}
		
		public int getnombreDePlacesDisponibles() {
			return nombreDePlaces-nombreDePlacesOcuppees;
		}
		
		public void remplir() throws ParkingPleinException{
			
			if(nombreDePlacesOcuppees >= nombreDePlaces) {
				
				throw new ParkingPleinException();
				
			}
			
			nombreDePlacesOcuppees ++ ;
			
		}
}
	