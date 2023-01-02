package gestion_de_serveurs;
import java.util.List;
import java.util.Map;

public class GestionnaireServeurs {
  private List<Serveur> serveursDisponibles;
  private Map<Utilisateur, List<Serveur>> serveursAttribues;

  public GestionnaireServeurs() {
    // Code pour initialiser la liste des serveurs disponibles et la map des serveurs attribués
  }

  public List<Serveur> getServeursDisponibles() {
    return serveursDisponibles;
  }

  public void setServeursDisponibles(List<Serveur> serveursDisponibles) {
    this.serveursDisponibles = serveursDisponibles;
  }

  public Map<Utilisateur, List<Serveur>> getServeursAttribues() {
    return serveursAttribues;
  }

  public void setServeursAttribues(Map<Utilisateur, List<Serveur>> serveursAttribues) {
    this.serveursAttribues = serveursAttribues;
  }
  
  public void attribuerServeur(Utilisateur utilisateur, Serveur serveur) {
	    // Code pour attribuer un serveur à un utilisateur
	    serveursDisponibles.remove(serveur);
	    List<Serveur> serveursUtilisateur = serveursAttribues.get(utilisateur);
	    serveursUtilisateur.add(serveur);
	    serveursAttribues.put(utilisateur, serveursUtilisateur);
	  }
	  
	  public void desattribuerServeur(Utilisateur utilisateur, Serveur serveur) {
	    // Code pour désattribuer un serveur à un utilisateur
	    List<Serveur> serveursUtilisateur = serveursAttribues.get(utilisateur);
	    serveursUtilisateur.remove(serveur);
	    serveursAttribues.put(utilisateur, serveursUtilisateur);
	    serveursDisponibles.add(serveur);
	  }
	  
	  public void lancerServeur(Serveur serveur) {
	    // Code pour lancer un serveur
	    serveur.lancerServeur();
	  }
	  
	  public void arreterServeur(Serveur serveur) {
	    // Code pour arrêter un serveur
	    serveur.arreterServeur();
	  }

	public void ajouterServeur(Serveur serveur) {
		// TODO Auto-generated method stub
		
	}
	}
