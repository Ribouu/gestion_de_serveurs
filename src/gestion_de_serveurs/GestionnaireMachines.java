package gestion_de_serveurs;
import java.util.List;

public class GestionnaireMachines {
  private List<Machine> machines;

  public GestionnaireMachines() {
    // Code pour initialiser la liste des machines
  }

  public List<Machine> getMachines() {
    return machines;
  }

  public void setMachines(List<Machine> machines) {
    this.machines = machines;
  }
  
  public void ajouterMachine(Machine machine) {
    // Code pour ajouter une machine à la liste des machines gérées
    machines.add(machine);
  }
  
  public void retirerMachine(Machine machine) {
    // Code pour retirer une machine de la liste des machines gérées
    machines.remove(machine);
  }
}
