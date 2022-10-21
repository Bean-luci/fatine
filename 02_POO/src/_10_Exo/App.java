package _10_Exo;

public class App {

	/*
	 * Le directeur d'une entreprise de produits chimiques souhaite g�rer les
	 * salaires et primes de ses employ�s au moyen d'un programme Java. Un employ�
	 * est caract�ris� par :
	 * - son nom
	 * - son pr�nom
	 * - son �ge
	 * - sa date d'entr�e en service (string) dans l'entreprise.
	 * 
	 * Codez une classe abstraite Employe dot�e :
	 * 
	 * - des attributs n�cessaires
	 * - d'une m�thode abstraite "calculerSalaire" (ce calcul d�pendra en effet du type de l'employ�)
	 * - d'une m�thode "getNom" retournant une chaine de caract�res obtenue en concat�nant la chaine de
	 * caract�res "L'employ� " avec le pr�nom et le nom.
	 * - d'un constructeur prenant en param�tre l'ensemble des attributs n�cessaires.
	 * 
	 * Calcul du salaire
	 * 
	 * Le calcul du salaire mensuel d�pend du type de l'employ�. On distingue les
	 * types d'employ�s suivants :
	 * 
	 * - Ceux affect�s � la Vente. Leur salaire mensuel vaut 20 % du chiffre
	 * d'affaire qu'ils r�alisent mensuellement, plus 400 Euros.
	 * 
	 * - Ceux affect�s � la Repr�sentation. Leur salaire mensuel vaut �galement 20
	 * % du chiffre d'affaire qu'ils r�alisent mensuellement, plus 800 Euros.
	 * 
	 * - Ceux affect�s � la Production. Leur salaire vaut le nombre d'unit�s
	 * produites mensuellement multipli�es par 5.
	 * 
	 * - Ceux affect�s � la Manutention. Leur salaire vaut leur nombre d'heures de
	 * travail mensuel multipli�es par 65 Euros.
	 * 
	 * Codez une hi�rarchie de classes pour les employ�s en respectant les conditions suivantes :
	 * 
	 * - La super-classe de la hi�rarchie doit �tre la classe "Employe".
	 * 
	 * - Les nouvelles classes doivent contenir les attributs qui leur sont
	 * sp�cifiques ainsi que le codage appropri� des m�thodes "calculerSalaire" et
	 * "getNom", en changeant le mot "employ�" par la cat�gorie correspondante. -
	 * Chaque sous classe est dot�e de constructeur prenant en argument l'ensemble
	 * des attributs n�cessaires.
	 * 
	 * N'h�sitez pas � introduire des classes interm�diaires pour �viter au maximum
	 * les redondances d'attributs et de m�thodes dans les sous-classes
	 * 
	 * Employ�s � risques
	 * 
	 * Certains employ�s des secteurs production et manutention sont appel�s �
	 * fabriquer et manipuler des produits dangereux. Apr�s plusieurs n�gociations
	 * syndicales, ces derniers parviennent � obtenir une prime de risque mensuelle.
	 * Compl�tez votre programme java en introduisant deux nouvelles sous-classes
	 * d'employ�s.
	 * 
	 * Ces sous-classes d�signeront les employ�s des secteurs production et
	 * manutention travaillant avec des produits dangereux.
	 * 
	 * Modifier votre programme de sorte � attribuer une prime mensuelle de 200 �
	 * aux employ�s � risque.
	 * 
	 * Collection d'employ�s
	 * 
	 * Satisfait de la hi�rarchie propos�e, notre directeur souhaite maintenant
	 * l'exploiter pour afficher le salaire de tous ses employ�s ainsi que le
	 * salaire moyen. Ajoutez une classe Personnel contenant une "collection"
	 * d'employ�s. Il s'agira d'une collection polymorphique d'Employe - regardez le
	 * cours si vous ne voyez pas de quoi il s'agit.
	 * 
	 * D�finissez ensuite les m�thodes suivantes � la classe Personnel :
	 * 
	 * - void ajouterEmploye(Employe) : ajoute un employ� � la collection.
	 * - void calculerSalaires() : affiche le salaire de chacun des employ�s de la collection.
	 * - double salaireMoyen() : affiche le salaire moyen des employ�s de la collection.
	 * 
	 * Tester le tout avec la m�thode main ci dessous.
	 * 
	 * 
	 */

	public static void main(String[] args) {

//			IPersonnel p = new Personnel();
//			
//			p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
//			p.ajouterEmploye(new Representant("L�on", "Vendtout", 25, "2001", 20000));
//			p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000, false));
//			p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45, false));
//			p.ajouterEmploye(new Technicien("Jean", "Flippe", 28, "2000", 1000, true));
//			p.ajouterEmploye(new Manutentionnaire("Al", "Abordage", 30, "2001", 45, true));
//			
//			p.calculerSalaires();
//			
//			System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + "Euros.");

		// System.out.println();
		// p.afficherEmployes();
	}
	
	/*
	 * 
	 * Vous devriez obtenir quelque chose comme :
	 * Le vendeur Pierre Business gagne 6400.0 Euros.
	 * Le repr�sentant L�on Vendtout gagne 4800.0 Euros.
	 * Le technicien Yves Bosseur gagne 5000.0 Euros.
	 * Le manut. Jeanne Stocketout gagne 2925.0 Euros.
	 * Le technicien Jean Flippe gagne 5200.0 Euros.
	 * Le manut. Al Abordage gagne 3125.0 Euros. Le salaire moyen dans l'entreprise est de 4575.0 Euros.
	 */
}
