package _01_Constructeur;

public class App {

	public App() {
		
	}

	public static void main(String[] args) {
		User user1= new User(); //Appel constructeur sans param�tre de la classe "User" pour instancier un objet nomm�e "user1"
		User user2= new User("duck","riri");
		
		
		System.out.println("Nombre d'utilisateurs: "+ User.nUsers);
		User user3= new User("duck","fifi", 12);
		System.out.println("Nombre d'utilisateurs: "+ User.nUsers);
		System.out.println(user3);
	}

}
