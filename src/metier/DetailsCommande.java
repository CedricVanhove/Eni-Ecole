package metier;

public class DetailsCommande 
{
 private int numLigne;
 private Commande laCommande;
 private Article lArticle;
 private int qte;
public int getNumLigne() {
	return numLigne;
}
public void setNumLigne(int numLigne) {
	this.numLigne = numLigne;
}
public Commande getLaCommande() {
	return laCommande;
}
public void setLaCommande(Commande laCommande) {
	this.laCommande = laCommande;
}
public Article getlArticle() {
	return lArticle;
}
public void setlArticle(Article lArticle) {
	this.lArticle = lArticle;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}
public DetailsCommande(int numLigne, Commande laCommande, Article lArticle,
		int qte) {
	super();
	this.numLigne = numLigne;
	this.laCommande = laCommande;
	this.lArticle = lArticle;
	this.qte = qte;
}
 
 
}
