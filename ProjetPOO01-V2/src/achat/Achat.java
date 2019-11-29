package achat;

import java.util.Date;

public class Achat {
	
   public Date dateAchat;
   public String intitule;
   public String qte;
   
public Achat(Date date, String intitule, String qte) {
	super();
	this.dateAchat = date;
	this.intitule = intitule;
	this.qte = qte;
}
public Date getDateAchat() {
	return dateAchat;
}
public void setDateAchat(Date dateAchat) {
	this.dateAchat = dateAchat;
}
public String getIntitule() {
	return intitule;
}
public void setIntitule(String intitule) {
	this.intitule = intitule;
}
public String getQte() {
	return qte;
}
public void setQte(String qte) {
	this.qte = qte;
}
@Override
public String toString() {
	return "Achat [dateAchat=" + dateAchat + ", intitule=" + intitule + ", qte=" + qte + "]";
}


}

