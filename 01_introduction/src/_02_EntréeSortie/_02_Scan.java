package _02_EntréeSortie;

import java.util.Scanner;

public class _02_Scan {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);
		
		int n = 0;
		System.out.println("Entrer un nombre entier: ");
		System.err.println("Le carré de " +n+ " vaut "+ n*n);
		System.out.println("Entrer un nombre à virgule flottante : ");
		double d = clavier.nextDouble();
		System.out.println("Vous avez entré " + d);
		
		System.out.println("Entrez une phrase svp... " );
		String str= clavier.next();
		str += clavier.nextLine();
		System.out.println(str);
		
		
		clavier.close();
	}

}
