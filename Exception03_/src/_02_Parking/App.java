package _02_Parking;

public class App {

	public static void main(String[] args) {
		
		
		Parking parc= new Parking(5);
		
		try {
			parc.remplir();
						System.out.println(" Il  reste " + parc.getnombreDePlacesDisponibles()+ " places disponibles");
			
			parc.remplir();
						System.out.println(" Il  reste " + parc.getnombreDePlacesDisponibles()+ " places disponibles");
						
			parc.remplir();
						System.out.println(" Il  reste " + parc.getnombreDePlacesDisponibles()+ " places disponibles");
						
			parc.remplir();
						System.out.println(" Il  reste " + parc.getnombreDePlacesDisponibles()+ " places disponibles");
						
			parc.remplir();
						System.out.println(" Il  reste " + parc.getnombreDePlacesDisponibles()+ " places disponibles");
			
		} catch (ParkingPleinException ex) {
		
			System.out.println(ex.getMessage());
			
			
			
		} 

	}

}
