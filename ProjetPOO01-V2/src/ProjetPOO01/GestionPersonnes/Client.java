package ProjetPOO01.GestionPersonnes;

import java.util.ArrayList;
import java.util.List;

import achat.Achat;

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
	public boolean paie() {
		return false;
		
	}

	public String getNumClient() {
		return numClient;
	}

	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}

	@Override
	public void achete(List<Achat> ListAchat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estClient() {
		// TODO Auto-generated method stub
		
		return false;
	}
	
	public List<IClient> ListClient(){
		
		List<IClient> lic = new ArrayList<IClient>();
		
		for (IClient c: lic)
		{
			if (lic instanceof IClient) {
				
				{ if (c.estClient()== true)
					lic.add((IClient) c);
				}
				
			}
		}
		return lic;
		
	}

	
}
