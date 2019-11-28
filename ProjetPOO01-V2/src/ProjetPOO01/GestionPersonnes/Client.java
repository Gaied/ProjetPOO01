package ProjetPOO01.GestionPersonnes;

public class Client extends Personne implements IClient, IFournisseur {
	
	public String numClient;

	public Client(String nom, String prenom, String adresse, String ville, String codepostal, String numClient) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numClient = numClient;
	}

	@Override
	public String toString() {
		return "Client []" +super.toString();
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

	public String getNumClient() {
		return numClient;
	}

	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}

	
}
