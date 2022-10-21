package _08_Equals;

public class App {

	public static void main(String[] args) {
		
		CompteBancaire cb1= new CompteBancaire("riri", "aaa", 1000);
		CompteBancaire cb2= new CompteBancaire("fifi", "bbb", 1000);
		CompteBancaire cb3= new CompteBancaire("loulou", "ccc", 2000);
		CompteBancaire cb4= new CompteBancaire("riri", "aaa", 1000);
		
		System.out.println(cb1);
		
		System.out.println(cb3.equals(cb2)); // true
		System.out.println(cb4.equals(cb1)); //false
		
	}

}
