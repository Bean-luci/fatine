package _04_Operateurs;

public class _04_Logique_Java {

	public static void main(String[] args) {
		/*
		 * les opérateurs logiques s'appliquent à des opérandes de types boolean et produisent un résultat également boolean
		 * Java comporte 3 opérateur logiques (dont un unaire)
		 */
		boolean A= false;
		boolean B= true; 
		
		if (A && B) {
			System.out.println("A et B sont tous les deux vrais");
		}
		else{
			System.out.println("A et B ne sont pas tous les deux vrais");
			
		}
		
		if (A|| B) {
			System.out.println("A ou B est vrai");
		}
		if (!A) {
			System.out.println("A n'est pas vrai");
		}
		
		

	}

}
