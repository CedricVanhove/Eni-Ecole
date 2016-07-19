package metier;

public class Personnel {
	private String num;
	private String nom;
	private String prenom;
	private String login;
	private String mdp;
	private boolean estManager;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public boolean isEstManager() {
		return estManager;
	}
	public void setEstManager(boolean estManager) {
		this.estManager = estManager;
	}
	@Override
	public String toString() {
		return "Personnel [num=" + num + ", nom=" + nom + ", prenom=" + prenom
				+ ", login=" + login + ", mdp=" + mdp + ", estManager="
				+ estManager + "]";
	}
	public Personnel(String num, String nom, String prenom, String login,
			String mdp, boolean estManager) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.estManager = estManager;
	}
	public Personnel() {
		super();
	}
	
	
	
}
