package gestion_de_serveurs;
import java.util.List;

public class Utilisateur {
  private String nomUtilisateur;
  private String motDePasse;
  private List<Serveur> serveurs;

  public Utilisateur(String nomUtilisateur, String motDePasse) {
	    this.nomUtilisateur = nomUtilisateur;
	    this.motDePasse = motDePasse;
	  }

	  public String getNomUtilisateur() {
	    return nomUtilisateur;
	  }

	  public void setNomUtilisateur(String nomUtilisateur) {
	    this.nomUtilisateur = nomUtilisateur;
	  }

	  public String getMotDePasse() {
	    return motDePasse;
	  }

	  public void setMotDePasse(String motDePasse) {
	    this.motDePasse = motDePasse;
	  }

	  public List<Serveur> getServeurs() {
	    return serveurs;
	  }

	  public void setServeurs(List<Serveur> serveurs) {
	    this.serveurs = serveurs;
	  }
	  
	  public void ajouterServeur(Serveur serveur) {
	    // Code pour ajouter un serveur à la liste des serveurs de l'utilisateur
	    serveurs.add(serveur);
	  }
	  
	  public void retirerServeur(Serveur serveur) {
	    // Code pour retirer un serveur de la liste des serveurs de l'utilisateur
	    serveurs.remove(serveur);
	  }
	}

