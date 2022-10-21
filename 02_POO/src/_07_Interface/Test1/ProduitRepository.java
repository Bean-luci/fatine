package _07_Interface.Test1;

import java.util.List;

public interface ProduitRepository {

	List<Produit>getALL (); 
	
	void addProduit(Produit p);
	
	void updateProduit(Produit p);
	
	void deleteProduit(int id); 
	
}
