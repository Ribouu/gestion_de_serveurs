package gestion_de_serveurs;
import java.util.Map;

public class Serveur {
  private String nom;
  private String jeu;
  private int vRam;
  private int vStockage;
  private Map<String, String> parametresJeu;
  private Machine machine;

  public Serveur(String nom, String jeu, int vRam, int vStockage, Map<String, String> parametresJeu) {
    this.nom = nom;
    this.jeu = jeu;
    this.vRam = vRam;
    this.vStockage = vStockage;
    this.parametresJeu = parametresJeu;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getJeu() {
    return jeu;
  }

  public void setJeu(String jeu) {
    this.jeu = jeu;
  }

  public int getvRam() {
    return vRam;
  }

  public void setvRam(int vRam) {
    this.vRam = vRam;
  }

  public int getvStockage() {
    return vStockage;
  }

  public void setvStockage(int vStockage) {
    this.vStockage = vStockage;
  }

  public Map<String, String> getParametresJeu() {
    return parametresJeu;
  }

  public void setParametresJeu(Map<String, String> parametresJeu) {
    this.parametresJeu = parametresJeu;
  }
  
  public Machine getMachine() {
	    return machine;
	  }
	  
  public void setMachine(Machine machine) {
    this.machine = machine;
  }
  
  public void lancerServeur() {
    // Code pour lancer le serveur
  }
  
  public void arreterServeur() {
    // Code pour arrêter le serveur
  }
  
  public void changerParametresJeu(String parametre, String valeur) {
    // Code pour changer les paramètres de jeu
    parametresJeu.put(parametre, valeur);
  }
}
