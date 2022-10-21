package _03_Type_01_Types_Primitifs;

public class _02_Entier_Java {

	public static void main(String[] args) {
		/**
		 * il existe 4 types entiers: byte, short, int, long
		 * ces types se differencient par la taille (nbre octets) des variables qu'ils permettent de stocker
		 */
			byte b =127;
			short s= 32767;
			long l= 20000_0_00_000L;
			int i= 300000000;
			//A chaque type primitif est un type complexe sous forme de classe enveloppante "wrapper"
			//proposant des propriétés et des méthodes utilitaires
			/**
			 * Type primitif =) type complexe
			 * - byte=)Byte
			 * - short=)Short
			 * - int=)Integer
			 * - float=)Float
			 * - double=)Double
			 * - char=)Char
			 * - boolean=)Boulean
			 */
			System.out.printf(" - %s (%d bits) from %d to %d", Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
			System.out.printf(" - %s (%d bits) from %d to %d", Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
			System.out.printf(" - %s (%d bits) from %d to %d", Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

}
