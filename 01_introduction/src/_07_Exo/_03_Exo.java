package _07_Exo;

import java.util.Scanner;

public class _03_Exo {

	public static void main(String[] args) {
		
		Scanner oddevn = new Scanner(System.in);
        int prdnum;
        System.out.println("Entrez un numero:");
        prdnum = oddevn.nextInt();

        if (prdnum % 2 == 0)
            System.out.println("Pair");
        else
            System.out.println("Impair");
	}
	
	

}
