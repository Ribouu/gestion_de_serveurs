package gestion_de_serveurs;
import java.util.List;

public class GestionnaireUtilisateurs {
  private List<Utilisateur> utilisateurs;

  public GestionnaireUtilisateurs() {
    // Code pour initialiser la liste des utilisateurs
  }

  public List<Utilisateur> getUtilisateurs() {
    return utilisateurs;
  }

  public void setUtilisateurs(List<Utilisateur> utilisateurs) {
    this.utilisateurs = utilisateurs;
  }
  
  public void ajouterUtilisateur(Utilisateur utilisateur) {
    // Code pour ajouter un utilisateur à la liste des utilisateurs
    utilisateurs.add(utilisateur);
  }
  
  public void retirerUtilisateur(Utilisateur utilisateur) {
    // Code pour retirer un utilisateur de la liste des utilisateurs
    utilisateurs.remove(utilisateur);
  }
}
