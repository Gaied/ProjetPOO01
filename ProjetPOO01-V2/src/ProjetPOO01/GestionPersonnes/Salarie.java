package ProjetPOO01.GestionPersonnes;

public class Salarie extends Personne implements IClient, IPatron {
	
	public String numsecurite;
	public double salaire;

	public Salarie(String nom, String prenom, String adresse, String ville, String codepostal, String numsecurite,
			double salaire) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numsecurite = numsecurite;
		this.salaire = salaire;
	}
	
	public String getNumsecurite() {
		return numsecurite;
	}

	public void setNumsecurite(String numsecurite) {
		this.numsecurite = numsecurite;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}



	@Override
	public String toString() {
		return "Salarie []" +super.toString();
	}

	@Override
	public void embauche() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void licencie() {
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

	@Override
	public void paiesalarie() {
		// TODO Auto-generated method stub
		
	}

}
