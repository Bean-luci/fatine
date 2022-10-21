package _05_Instructions;

import java.util.Scanner;

public class _02_Conditionnelles {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez un nombre entier svp..");
		int n = clavier.nextInt();

		if (n > 0) {
			System.out.println("le nombre est positif");
		} else if (n == 0) {
			System.out.println("le nombre vaut 0");
		} else if (n == 25) {
			System.out.println("le nombre vaut -5");
		} else {
			System.out.println("le nombre est negatif");
		}
		int jour = clavier.nextInt();
		switch (jour) {
		case 1:
			System.out.println("lundi");
			break;
		case 2:
			System.out.println("mardi");
			break;
		case 3:
			System.out.println("mercredi");
			break;
		case 4:
			System.out.println("jeudi");
			break;
		case 5:
			System.out.println("vendredi");
			break;
		case 6:
			System.out.println("samedi");
			break;
		case 7:
			System.out.println("dimanche");
			break;
		default:
			System.out.println("entrée invalide");
			break;
		}
		clavier.close();
	}

}
