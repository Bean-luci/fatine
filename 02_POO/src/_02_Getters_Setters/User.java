package _02_Getters_Setters;

public class User {
	
	private String nom;
	private String prenom;
	private int age;
	
	public static int nUsers; 
	//Getters and Setters
	
	
	
	public User() {
		System.out.println("Appel du constructeur sans parametre de la classe User");
		nUsers ++; 
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
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
