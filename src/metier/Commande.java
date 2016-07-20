package metier;

import java.util.ArrayList;

public class Commande {
	private int num;
	private String libelle;
	private String description;
	private String poids;
	private String Etats;
	private String Date;
	private ArrayList<DetailsCommande> lesLignes;
	private Personnel leSbire;
	private Client Pepito;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
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
	public ArrayList<DetailsCommande> getLesArticles() {
		return lesLignes;
	}
	public void setLesArticles(ArrayList<DetailsCommande> lesArticles) {
		this.lesLignes = lesArticles;
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
	public Commande(int num, String libelle, String description,
			String poids, String etats, String date,
			ArrayList<DetailsCommande> lesArticles, Personnel leSbire, Client pepito) {
		super();
		this.num = num;
		this.libelle = libelle;
		this.description = description;
		this.poids = poids;
		Etats = etats;
		Date = date;
		this.lesLignes = lesArticles;
		this.leSbire = leSbire;
		Pepito = pepito;
	}
	public Commande() {
		super();
		this.Pepito = new Client();
		this.leSbire = new Personnel();
		this.lesLignes = new ArrayList<DetailsCommande>();
		
	}
	
	
}
