package _03_Types_Complexes;
		/*
		 * Contrairement aux types primitifs, les types complexes (références) exposent des méthodes.
		 * Ils se distinguent visuellement des types primitifs en ce qui'ils commencent par une majuscule (PascaleCase)
		 */
public class _01_Strings {

	public static void main(String[] args) {
		String firstName= "riri";
		String lastName= "duck";
		
		String fullName = firstName + lastName;
		
		
		System.out.println(firstName);
		firstName= firstName.toUpperCase();
		System.out.println(firstName);
		
		String s1= "Bonjour";
		String s2= "Bonjour"; //n'alloue pas d'autre mémoire car une variable ayant la même valeur existe déja
		String s3= new String("Bonjour"); // alloue de la mémoire car appel au Constructeur (new)
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.charAt(2)); // 'n' retourne le caractère d'indice 2 (3eme caractère de Bonjour..)
		
		System.out.println(s1.concat(" riri"));
		
		System.out.println(s1.substring(2)); //retourne la sous chaine à partir de l'indice 2
		
		System.out.println(s1.substring(2,4));
		
		System.out.println(s1.toLowerCase()); 
		System.out.println(s1.toUpperCase());
		
		s1= "Ceci est une chaine de caractere";
		String []splitted= s1.split(""); //retourne un tableau de chaines de caractères
		for (String item: splitted) {
			System.out.print(item + "-"); }
			
			String replacement = s1.replace("Ceci", "Ce truc");
			System.out.println();
			System.out.println(replacement);
			
			String myStr="123";
			int myInt= Integer.parseInt(myStr);
			myStr= "2.36598";
			double myDouble= Double.parseDouble(myStr);
			System.out.println(myInt + " - "+ myDouble); // reconvertit implicitement les nombres en chaines de caractères
			
			/**
			 * Contrairement à la classe StringBuilder permet de créer des chaines de caractères modifiables
			 * il n'est donc pas necessaire de réalouer de la memoire à chaque fois quon effectue une modification
			 */
			StringBuilder builder = new StringBuilder (" Ceci est une chaine de caractères créee avec un strigBuilder.");
			System.out.println(builder);
			
			builder.append ("Il est donc possible de la modifier");
			
			System.out.println (builder);
			
			
		
		
		
	}

}
