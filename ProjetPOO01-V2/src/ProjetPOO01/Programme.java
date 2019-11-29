package ProjetPOO01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ProjetPOO01.GestionPersonnes.Client;
import ProjetPOO01.GestionPersonnes.Fournisseur;
import ProjetPOO01.GestionPersonnes.Patron;
import ProjetPOO01.GestionPersonnes.Salarie;
import achat.Achat;
import projetPOOException.ExceptionSaisie;

public class Programme {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		List<Salarie> ListSalarie = Programme.SaisirSalarie(5);
		
		List<Client> ListClient = Programme.SaisirClient(4);
		
		List<Fournisseur> ListFournisseur = Programme.SaisirFournisseur(3);
		
		List<Achat> ListAchat = Programme.saisirAchat(1);
		
		Patron Pr = Programme.SaisirPatron();
		System.out.println(Pr);
		
		System.out.println(ListSalarie);
		System.out.println(ListClient);
		System.out.println(ListFournisseur);
		System.out.println(ListAchat);
	}
	
	public static List<Salarie> SaisirSalarie(int n) {
		
		List<Salarie> ListSalarie = new ArrayList<Salarie>();
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de Salarie :");
		String nom = sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Salarie  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Salarie  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la ville de Salarie  :");
		String ville = sc.nextLine();
		
		System.out.println("Veuillez saisir le code postal de Salarie :");
		
		String codepostale = sc.nextLine();
		try {
			Salarie.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
			     
		System.out.println("Veuillez saisir le némuro de sécurité sociale de Salarie :");
		
		String numsecurite = sc.nextLine();
		try {
			Salarie.ctrlNumSecu(numsecurite);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
				
		System.out.println("Veuillez saisir le Salaire :");
		
		double salaire = sc.nextDouble();
		
		Salarie Sal1 = new Salarie(nom, prenom, adresse,ville, codepostale, numsecurite, salaire);
		
		ListSalarie.add(Sal1);
		
		sc.close();
		return ListSalarie;
		
		}

	public static List<Client> SaisirClient(int n) {
		
		 List<Client> ListClient = new ArrayList<Client>();
		 
		 for(int i=0; i<n ; i++  ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de Client :");
		String nom = sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Client  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Client  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Client  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Client :");
		String codepostale = sc.nextLine();
		System.out.println("Veuillez saisir le numéro de Client :");
		String numClient = sc.nextLine();
		
		Client cl1 = new Client(nom, prenom, adresse,ville, codepostale,numClient);
		sc.close();
		ListClient.add(cl1);
		 }
		return ListClient;	
	}
	
	public static List<Fournisseur> SaisirFournisseur(int n) {
		
		List<Fournisseur> ListFournisseur = new ArrayList<Fournisseur>();
		
		for(int i=0; i<n ; i++  ) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Veuillez saisir le nom de Fournisseur :");
		String nom =sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Fournisseur  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Fournisseur  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Fournisseur  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Fournisseur :");
		String codepostale = sc.nextLine();
		try {
			Salarie.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Veuillez saisir le numéro de Fournisseur :");
		String numfr = sc.nextLine();
		
		Fournisseur fr = new Fournisseur(nom, prenom, adresse,ville, codepostale,numfr);
		sc.close();
		ListFournisseur.add(fr);
		}
		return ListFournisseur;
	}
	
	public static Patron SaisirPatron() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de Patron :");
		String nom = sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Patron  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Patron  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Patron  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Patron :");
		String codepostale = sc.nextLine();
		try {
			Salarie.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Veuillez saisir le némuro de sécurité sociale de Patron :");
		String numsecurite = sc.nextLine();
		try {
			Salarie.ctrlNumSecu(numsecurite);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
        System.out.println("Veuillez saisir le Salaire de patron:");
		double salaire = sc.nextDouble();
		
		Patron p = new Patron(nom, prenom, adresse, ville, codepostale, numsecurite, salaire);
		sc.close();
		return p;
	}
	
	public static List<Achat> saisirAchat(int n) {
		
		List<Achat> ListAchat = new ArrayList<Achat>();
		
		for(int i=0; i<n ; i++  ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la date d'achat:");
		String date = sc.nextLine();
		System.out.println("Veuillez saisir l'intitulé d'achat:");
		String intitule = sc.nextLine();
		System.out.println("Veuillez saisir la quantité d'achat:");
		String qte = sc.nextLine();
		
		Achat a = new Achat(date, intitule, qte);
		sc.close();
		ListAchat.add(a);
	    }
		return ListAchat;
		
	}

}
