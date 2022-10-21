package _06_Polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Animal animal= new Animal();
		animal.communiquer();
		
		List<Animal> animaux= new ArrayList<Animal>();
		
		
		animaux.add(new Chien());
		animaux.add(new Chat());

		animaux.add(new Chat());

		animaux.add(new Chien());

		animaux.add(new Animal());
		
		
		for (Animal anim: animaux) {
			
			anim.communiquer();
		}
		

	}

}
