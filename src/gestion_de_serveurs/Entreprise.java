package gestion_de_serveurs;
import java.util.List;

public class Entreprise {
  private String nom;
  private String adresse;
  private GestionnaireMachines gestionnaireMachines;
  private GestionnaireUtilisateurs gestionnaireUtilisateurs;
  private GestionnaireServeurs gestionnaireServeurs;

  public Entreprise(String nom, String adresse) {
    this.nom = nom;
    this.adresse = adresse;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public GestionnaireMachines getGestionnaireMachines() {
    return gestionnaireMachines;
  }

  public void setGestionnaireMachines(GestionnaireMachines gestionnaireMachines) {
	    this.gestionnaireMachines = gestionnaireMachines;
	  }

  public GestionnaireUtilisateurs getGestionnaireUtilisateurs() {
	    return gestionnaireUtilisateurs;
	  }

  public void setGestionnaireUtilisateurs(GestionnaireUtilisateurs gestionnaireUtilisateurs) {
	    this.gestionnaireUtilisateurs = gestionnaireUtilisateurs;
	  }

  public GestionnaireServeurs getGestionnaireServeurs() {
	    return gestionnaireServeurs;
	  }

  public void setGestionnaireServeurs(GestionnaireServeurs gestionnaireServeurs) {
	    this.gestionnaireServeurs = gestionnaireServeurs;
	  }
	  
  public static void main(String[] args) {
    // Création de l'entreprise
    Entreprise ribou = new Entreprise("Ribou", "Paris");
    
    // Création du gestionnaire de machines
    GestionnaireMachines gestionnaireMachines = new GestionnaireMachines();
    
    // Création des machines
    for (int i = 0; i < 10; i++) {
      Machine machine = new Machine(Integer.toString(i), 32, 1000);
      gestionnaireMachines.ajouterMachine(machine);
    }
    
    // Affectation du gestionnaire de machines à l'entreprise
    ribou.setGestionnaireMachines(gestionnaireMachines);
    
    // Création du gestionnaire d'utilisateurs
    GestionnaireUtilisateurs gestionnaireUtilisateurs = new GestionnaireUtilisateurs();
    
    // Création des utilisateurs
    for (int i = 0; i < 46; i++) {
      Utilisateur utilisateur = new Utilisateur("utilisateur" + i, "motDePasse" + i);
      gestionnaireUtilisateurs.ajouterUtilisateur(utilisateur);
    }
    
    // Affectation du gestionnaire d'utilisateurs à l'entreprise
    ribou.setGestionnaireUtilisateurs(gestionnaireUtilisateurs);
    
    // Création du gestionnaire de serveurs
    GestionnaireServeurs gestionnaireServeurs = new GestionnaireServeurs();
    
    // Création des serveurs et affectation des machines
    List<Machine> machines = gestionnaireMachines.getMachines();
    for (int i = 0; i < 50; i++) {
      Serveur serveur = new Serveur(Integer.toString(i), "Minecraft", 4, 15, null);
      int machineIndex = i % 10;
      Machine machine = machines.get(machineIndex);
      serveur.setMachine(machine);
      gestionnaireServeurs.ajouterServeur(serveur);
    }
    
    // Affectation du gestionnaire de serveurs à l'entreprise
    ribou.setGestionnaireServeurs(gestionnaireServeurs);
    
    // Affiche les informations sur l'entreprise
    System.out.println("Entreprise : " + ribou.getNom());
    System.out.println("Adresse : " + ribou.getAdresse());
    System.out.println("Nombre de machines : " + gestionnaireMachines.getMachines().size());
    System.out.println("Nombre d'utilisateurs : " + gestionnaireUtilisateurs.getUtilisateurs().size());
    System.out.println("Nombre de serveurs disponibles : " + gestionnaireServeurs.getServeursDisponibles().size());
    System.out.println("Nombre de serveurs attribués : " + gestionnaireServeurs.getServeursAttribues().size());
  }
}

