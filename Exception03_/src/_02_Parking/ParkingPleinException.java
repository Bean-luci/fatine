package _02_Parking;

public class ParkingPleinException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ParkingPleinException() {
		
		super (" Il n'y a plus de place disponible dans le parking");
	}
	
	public ParkingPleinException(String message) {
		
		super(message);
	}
	
}
