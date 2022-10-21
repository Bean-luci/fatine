package _02_EntréeSortie;

public class _01_Print {

	public static void main(String[] args) {
		// le caractère \ est un caractère d'échappement qui permet d'écrire des caractères spéciaux dans une chaine de caractère
		System.out.print("la methode \"println\" permet d'ecrire une ligne" );
		System.out.print("la methode \"println\" permet d'ecrire une ligne" );
		System.out.print("la methode \"println\" permet d'ecrire une ligne" );
		
		
		String str = "printf";
		
		System.out.printf ("la méthode %s permet d'écrire des chaines de caractères formatées",str);
		
		/*%s permet de formater une chaine de caractère
		 *%c permet de formater un caractère
		 *%d permet de formater un entier en base décimal
		 *%x permet de formater un entier sous forme d'exadecimale
		 *%e permet de formater un réel sous forme décimale en notation scientifique 
		 *%f permet de formater unréel sous forme décimale
		 *%t permet de formater les dates 
		 */
		int monEntier= 25;
		System.err.printf("\nMon entier vaut %d\n", monEntier);
		System.out.println("Mon entier vaut " + monEntier); //Plus simple avec concaténation.
		
		System.out.printf("%f\n", Math.PI);
		System.out.printf("%.3f\n", Math.PI);
	}

}
