package metier;

import java.util.ArrayList;

import sun.invoke.empty.Empty;

public class Article {
	private int num;
	 private String libelle;
	 private String description;
	 private String poids;
	
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
	
	@Override
	public String toString() {
		return "Article [num=" + num + ", libelle=" + libelle
				+ ", description=" + description + ", poids=" + poids
				+ "]";
	}
	public Article(int num, String libelle, String description,
			String poids, String quantite) {
		super();
		this.num = num;
		this.libelle = libelle;
		this.description = description;
		this.poids = poids;
	
	}
	public Article() {
		super();
	}
	 
	
	
	 
	 
	 
	 
}
