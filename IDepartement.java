
import java.util.HashSet;

public interface IDepartement {
    void ajouterDepartement(Departement departement);
    void supprimerDepartement(Departement departement);
    HashSet<Departement> getListeDepartements();
}