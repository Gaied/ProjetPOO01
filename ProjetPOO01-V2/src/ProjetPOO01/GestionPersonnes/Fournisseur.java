package ProjetPOO01.GestionPersonnes;

public class Fournisseur extends Personne implements IClient, IFournisseur {
	
	public String numFournisseur;

	public Fournisseur(String nom, String prenom, String adresse, String ville, String codepostal,
			String numFournisseur) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numFournisseur = numFournisseur;
	}

	public String getNumFournisseur() {
		return numFournisseur;
	}

	public void setNumFournisseur(String numFournisseur) {
		this.numFournisseur = numFournisseur;
	}

	@Override
	public String toString() {
		return "Fournisseur []" +super.toString();
	}

	@Override
	public void livre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commande() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void achete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paie() {
		// TODO Auto-generated method stub
		
	}

}
