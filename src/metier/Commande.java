package metier;

import java.util.ArrayList;

public class Commande {
	private String num;
	private String libelle;
	private String description;
	private String poids;
	private String Etats;
	private String Date;
	private ArrayList<Article> lesArticles;
	private Personnel leSbire;
	private Client Pepito;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPoids() {
		return poids;
	}
	public void setPoids(String poids) {
		this.poids = poids;
	}
	public String getEtats() {
		return Etats;
	}
	public void setEtats(String etats) {
		Etats = etats;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public ArrayList<Article> getLesArticles() {
		return lesArticles;
	}
	public void setLesArticles(ArrayList<Article> lesArticles) {
		this.lesArticles = lesArticles;
	}
	public Personnel getLeSbire() {
		return leSbire;
	}
	public void setLeSbire(Personnel leSbire) {
		this.leSbire = leSbire;
	}
	public Client getPepito() {
		return Pepito;
	}
	public void setPepito(Client pepito) {
		Pepito = pepito;
	}
	public Commande(String num, String libelle, String description,
			String poids, String etats, String date,
			ArrayList<Article> lesArticles, Personnel leSbire, Client pepito) {
		super();
		this.num = num;
		this.libelle = libelle;
		this.description = description;
		this.poids = poids;
		Etats = etats;
		Date = date;
		this.lesArticles = lesArticles;
		this.leSbire = leSbire;
		Pepito = pepito;
	}
	public Commande() {
		super();
		this.Pepito = new Client();
		this.leSbire = new Personnel();
		this.lesArticles = new ArrayList<Article>();
		
	}
	
	
}
