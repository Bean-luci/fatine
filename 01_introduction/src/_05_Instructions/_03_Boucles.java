package _05_Instructions;

import java.util.Scanner;

public class _03_Boucles {

	public static void main(String[] args) {
		/*
		 * Une boucle permet de repeter un certain nombre de fois une instruction ou un bloc
		 * 3 mot clés permettent de créer des boucles :
		 * for: permet de repeter un bloc un nom déterminé de fois
		 * for(initexpr,testExpr,incExpr){}
		 * while
		 * do while
		 */
		
		Scanner clavier= new Scanner (System.in);
		
		System.out.println("Entrez votre age :");
		int age =clavier.nextInt();
		while (age<=0)
		{
			System.out.println("entrez un age positif");
			age= clavier.nextInt();
		}	
		System.out.println("Vous avez "+ age + " ans Creveeeeez !!!");
		
		age= 0;
		
		do {
			System.out.println("entrez l'age de votre chien:");
			
			age=clavier.nextInt();		}
		while(age<=0);
		System.out.println("votre chien a "+ age+ " ans");	
			
		
		clavier.close();
	}
}
