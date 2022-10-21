package _07_Exo;

import java.util.Scanner;

public class _01_Exo {

	public static void main(String[] args) {
		//AU SECOUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUURS!!!
		
		int a, b, tmp;
	      System.out.print("Entrez deux nombres: ");
	      Scanner sc = new Scanner(System.in);
	     
	      a = sc.nextInt();
	      b = sc.nextInt();
	     
	      System.out.println("Avant la permutation: a = "+a+" et b = "+b);
	     
	      tmp = a;
	      a = b;
	      b = tmp;
	     
	      System.out.println("Aprés la permutation: a = "+a+" et b = "+b);
	}

}
