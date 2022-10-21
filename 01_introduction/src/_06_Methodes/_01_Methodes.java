package _06_Methodes;

public class _01_Methodes {
	public static void afficher() {
		System.out.println("Methode afficher");
		
	}
	public static void afficher(String message) {
		System.out.println(message);
		
	}
	public static void afficher(int[]tab) {
		System.out.println("\nMéthode afficher tab d'entiers");
		for(int i=0; i<tab.length;i++) {
			System.out.println(tab[i]);
			
		}
		
	}
	
	public static int Somme (int a, int b) {
		return a+b;
	}
	
	public static int power (int value, int pow) {
		if (pow==0) return 1;
		return value*power(value,pow-1);
	}
	
	public static void main(String[] args) {
		/*
		 * Une méthode represente un bloc d'instructions réutilicable
		 * Elle permet d'éviter les répétitions de code
		 * Une méthose se différencie d'une fonction en ce qu'elle est necessairement rattachée à un objet
		 * Etant purement Objet , Java ne supporte que le concept de méthode
		 */
		afficher(); 
		afficher("Méthode affiché surchargée avec paramètre"); 
		
		int[] tab= {10,20,30};
		
		afficher(tab);
		afficher("Somme: ");
		
		System.out.println("Somme(2,3)="+ Somme(2,3));
		
		afficher ("power(2.3)= "+ power(2,3));
		
		
		
	}

}
