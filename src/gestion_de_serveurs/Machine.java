package gestion_de_serveurs;
import java.util.List;

public class Machine {
  private String nom;
  private int vRamDisponible;
  private int vStockageDisponible;
  private List<Serveur> serveurs;

  public Machine(String nom, int vRamDisponible, int vStockageDisponible) {
    this.nom = nom;
    this.vRamDisponible = vRamDisponible;
    this.vStockageDisponible = vStockageDisponible;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getvRamDisponible() {
    return vRamDisponible;
  }

  public void setvRamDisponible(int vRamDisponible) {
    this.vRamDisponible = vRamDisponible;
  }

  public int getvStockageDisponible() {
    return vStockageDisponible;
  }

  public void setvStockageDisponible(int vStockageDisponible) {
    this.vStockageDisponible = vStockageDisponible;
  }

  public List<Serveur> getServeurs() {
    return serveurs;
  }

  public void setServeurs(List<Serveur> serveurs) {
    this.serveurs = serveurs;
  }
  
  public void ajouterServeur(Serveur serveur) {
    // Code pour ajouter un serveur à la liste des serveurs hébergés par la machine
    serveurs.add(serveur);
  }
  
  public void retirerServeur(Serveur serveur) {
    // Code pour retirer un serveur de la liste des serveurs hébergés par la machine
    serveurs.remove(serveur);
  }
}