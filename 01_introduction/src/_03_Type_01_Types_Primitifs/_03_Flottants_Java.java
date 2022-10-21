package _03_Type_01_Types_Primitifs;

public class _03_Flottants_Java {

	public static void main(String[] args) {
		/**
		 * 2 types numériques flottants:
		 * - float sur 4 octets (32 bits3)
		 * - float sur 8 octets (64 bits)
		 */
		System.out.printf(" - %s (%d bits) from %e to %e", Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf(" - %s (%d bits) from %e to %e", Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
		//Notation traditionnelle
		float myFloat= 3.4f;
		double myDouble= 3.4; 
		
		myDouble=100_00_00_00_00_00.99;
		
		System.out.println("myDouble= "+ myDouble);
		
		//Notation exponentielle
		float myFloatExp= 3.4e10f;
		double myDoubleExp= 3.4e10;
		
		System.out.println("myFloatExp = "+ myFloatExp);
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.NaN);
		
		System.out.println(Float.isFinite(Float.NEGATIVE_INFINITY));// False 

		
	}

}
