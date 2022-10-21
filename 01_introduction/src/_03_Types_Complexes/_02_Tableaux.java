package _03_Types_Complexes;

import java.util.ArrayList;

/*
 * Un tableau est de type Complexe (Ref ou Objet), une fois initialisé il n'est plus possible de changer sa taille
 * mais comme pour la classe string il est néanmoins possible de réafecter un nouveau tableau à la place de l'ancien
 */

public class _02_Tableaux {

	public static void main(String[] args) {
		
		
		int [] tab ; // déclaration d'un tableau entier non initialisé
		String[] names = {"riri","fifi"	};
		System.out.println(names.length);
		System.out.println(names[1]);
		System.out.println("Parcours du tableau avec une boucle\"for\"traditionnelle");
		
		for (int i=0 ; i<names.length; i++)
		{System.out.println(names [i]);}
		
		System.out.println("Parcours du tableau avec une boucle \"foreach\"");
		
		for (String name: names) {
			System.out.println(name);
		}
		
		String [][] names2D= {{"riri","fifi","loulou"},{"donald","daisy","picsou"}};
		
		for (int line=0; line< names2D.length;line++) {
			for (int column =0; column< names2D [line].length; column++) {
				System.out.print(names2D [line][column]+ " ");
				
			}
			System.out.println();
		}
		
		/*
		 * ArrayList
		 * Un ArrayList est un objet de type collection comme un tableau, une collection permet de stocker un ensemble de valeurs
		 * mais contrairement à un tableau, une collection a une taille dynamique.
		 */
		
		ArrayList <String> namesCollection= new ArrayList<String>(); //Collection instanciée sans préciser de taille
		namesCollection.add("riri");
		namesCollection.add("fifi");
		namesCollection.add("loulou");
		
		System.out.println("Size = "+ namesCollection.size());
		
}
}