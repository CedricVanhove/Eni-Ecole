package metier;

public class Client 
{
 private String id;
 private String nom;
 private String prenom;
 private String adresse;
 private String CP;
 private String ville;
 private String tel;
 private String mail;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getCP() {
	return CP;
}
public void setCP(String cP) {
	CP = cP;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
@Override
public String toString() {
	return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom
			+ ", adresse=" + adresse + ", CP=" + CP + ", ville=" + ville
			+ ", tel=" + tel + ", mail=" + mail + "]";
}
public Client(String id, String nom, String prenom, String adresse, String cP,
		String ville, String tel, String mail) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	CP = cP;
	this.ville = ville;
	this.tel = tel;
	this.mail = mail;
}
public Client() {
	super();
}
 
 
 /*TODO get les commandes du client*/
}
