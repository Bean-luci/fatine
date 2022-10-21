package _01_Constructeur;

public class User {
	
	public String nom;
	public String prenom;
	public int age;
	
	public static int nUsers; 
	public User() {
		System.out.println("Appel du constructeur sans parametre de la classe User");
		nUsers ++; 
		
	}
	public User(String nom, String prenom) {
		this();
		System.out.println("Appel au constructeur a 2 parametres de la classe User");
		
		this.nom= nom;
		this.prenom= prenom;
		//nUsers ++; 
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	public User(String nom, String prenom, int age) {
		//super();
		
		this(nom,prenom);
		//this.nom = nom;
		//this.prenom = prenom;
		this.age = age;
		System.out.println("Appel du constructeur a 3 parametres de la classe User");
	}
	public static void main(String[] args) {



	}

}
