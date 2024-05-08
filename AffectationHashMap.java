import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.TreeMap;
public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

  
    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // Méthode  ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    // Méthode  afficher les employés et  départements
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employe: " + entry.getKey() + ", Departement: " + entry.getValue());
        }
    }

    // Méthode pour supprimer un employé de la collection
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // Méthode  supprimer un employé
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }


    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println("Employe: " + e);
        }
    }


    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println("Departement: " + d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }


    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }


    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}