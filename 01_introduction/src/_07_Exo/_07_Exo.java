package _07_Exo;

public class _07_Exo {

	public static void main(String[] args) {
		
	}
	public static void triInsertion(int tableau[])
    {
    int longueur=tableau.length;
    
    for(int i=1;i<longueur;i++)
        {
        int memory=tableau[i];
        int compt=i-1;
        boolean marqueur;
        do
            {
            marqueur=false;
            if (tableau[compt]>memory)
                {
                tableau[compt+1]=tableau[compt];
                compt--;
                marqueur=true;
                }
            if (compt<0) marqueur=false;
            }
        while(marqueur);
        tableau[compt+1]=memory;
        }
    }

}
