package _07_Exo;

import java.util.Scanner;

public class _05_Exo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Entrez une année: ");
        int y = s.nextInt();
        boolean b = false;
        if(y % 400 == 0)
        {
            b = true;
        }
        else if (y % 100 == 0)
        {
            b = false;
        }
        else if(y % 4 == 0)
        {
            b = true;
        }
        else
        {
            b = false;
        }
        if(b == true)
        {
            System.out.println("L'année "+ y +" est une année bissextile");
        }
        else
        {
            System.out.println("L'année "+ y +" n'est pas une année bissextile");
        }

	}

}
