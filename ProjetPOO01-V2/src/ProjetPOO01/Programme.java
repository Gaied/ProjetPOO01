package ProjetPOO01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ProjetPOO01.GestionPersonnes.Client;
import ProjetPOO01.GestionPersonnes.Fournisseur;
import ProjetPOO01.GestionPersonnes.Salarie;
import projetPOOException.ExceptionSaisie;

public class Programme {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Salarie> ListSalarie = Programme.SaisirSalarie(5);
		
		List<Client> ListClient = Programme.SaisirClient(4);
		
		List<Fournisseur> ListFournisseur = Programme.SaisirFournisseur(3);
		
		System.out.println(ListSalarie);
		System.out.println(ListClient);
		System.out.println(ListFournisseur);	
	}
	
	public static List<Salarie> SaisirSalarie(int n) {
		
		List<Salarie> ListSalarie = new ArrayList<Salarie>();
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de Salarie :");
		String nom = sc.nextLine();
		System.out.println("Veuillez saisir le pr�nom de Salarie  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Salarie  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la ville de Salarie  :");
		String ville = sc.nextLine();
		
		System.out.println("Veuillez saisir le code postal de Salarie :");
		
		String codepostale = sc.nextLine();
		try {
			Programme.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
			     
		System.out.println("Veuillez saisir le n�muro de s�curit� sociale de Salarie :");
		
		String numsecurite = sc.nextLine();
		try {
			Programme.ctrlNumSecu(numsecurite);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
				
		System.out.println("Veuillez saisir le Salaire:");
		
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
		System.out.println("Veuillez saisir le pr�nom de Client  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Client  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Client  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Client :");
		String codepostale = sc.nextLine();
		System.out.println("Veuillez saisir le num�ro de Client :");
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
		System.out.println("Veuillez saisir le pr�nom de Fournisseur  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Fournisseur  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Fournisseur  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Fournisseur :");
		String codepostale = sc.nextLine();
		System.out.println("Veuillez saisir le num�ro de Fournisseur :");
		String numfr = sc.nextLine();
		
		Fournisseur fr = new Fournisseur(nom, prenom, adresse,ville, codepostale,numfr);
		sc.close();
		ListFournisseur.add(fr);
		}
		return ListFournisseur;
	}
	
	public static void ctrlCodePostale (String cp) throws ExceptionSaisie {
		
		   if (cp.length()!=5) {
			   
			  throw  new ExceptionSaisie ("Le nombre de caract�re est diff�rent de 5.");	
			}
		   try {
			   Integer.parseInt(cp);
			
		} catch (Exception e) {
			// TODO: handle exception
			 throw  new ExceptionSaisie ("Il faut saisir uniquement des chiffres");	
		}
			}
	public static void ctrlNumSecu (String nums) throws ExceptionSaisie {
		
		   if (nums.length()!=13) {
			   
			  throw  new ExceptionSaisie ("Le nombre de caract�re est diff�rent de 13.");	
			}
		   try {
			   Integer.parseInt(nums);
			
		} catch (Exception e) {
			// TODO: handle exception
			 throw  new ExceptionSaisie ("Il faut saisir uniquement des chiffres");
		}
			}

}
