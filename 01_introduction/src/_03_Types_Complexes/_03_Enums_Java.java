package _03_Types_Complexes;
/*
 * Un type énuméré est un types de données comportant un ensemble fini d'états (ou de valeurs) auxquels son associés un nom,
 * Un type énuméré doit être déclaré dans un fichier séparé portant le nom de l'enum 
 */
public class _03_Enums_Java {

	public static void main(String[] args) {
		
		MonEnum rouge= MonEnum.ROUGE;
		MonEnum vert= MonEnum.VERT;
		
		System.out.println(rouge);
		System.out.println(vert);

	}

}
