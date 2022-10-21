package _03_Type_01_Types_Primitifs;

public class _04_Caractere_Java {

	public static void main(String[] args) {
		/**
		 * Un caractère est stocké en mémoire sous forme d'une valeur numérique codée en 2 octets.
		 */
		
		char c = 'a';
		System.out.println(c);
		c = 97; 
		
		System.out.println(c);
		
		char c1= '\n'; // retour à la ligne
		char c2= '\t'; // tabulation
		char c3= '\\'; // antislas$h
		char c4= '\''; // apostrophe
		// Méthodes permettant de tester un caractère
		
		boolean isDigit = Character.isDigit(c);
		System.out.println(isDigit);//false
		
		boolean isLetter=  Character.isLetter(c);
		
		System.out.println(isLetter); //true
		
		boolean isUpperCase= Character.isUpperCase(c);
				
		System.out.println(isUpperCase);//false
		 
	}

}
