package _05_Abstraction;

public class App {

	public static void main(String[] args) {
		Carre carre = new Carre (5);
		
		System.out.println(carre);
		System.out.println("Surface du carre: "+ carre.surface());
		
		Cercle cercle = new Cercle(5);
		System.out.println(cercle);
		System.out.println("Surface du cercle: "+ cercle.surface());

	}

}
