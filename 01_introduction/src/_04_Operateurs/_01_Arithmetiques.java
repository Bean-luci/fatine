package _04_Operateurs;

public class _01_Arithmetiques {

	public static void main(String[] args) {
		int v1= 4;
		int v2; //Var non initialisée
		v2= 10;// Il faut initialiser une variable avant de pouvoir s'en servir
		
		System.out.println("sum:" + (v1+v2));
		System.out.println("sub:" + (v1-v2));
		System.out.println("prod:" + (v1*v2));
		System.out.println("div:" + (v1/v2));
		System.out.println("modulo:" + (v1%v2)); // modulo: reste de la division entière

	}

}
