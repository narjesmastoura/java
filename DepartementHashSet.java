import java.util.HashSet;
class DepartementHashSet implements IDepartement {
    private  HashSet<Departement> listeDepartements ;

    public DepartementHashSet() {
        listeDepartements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        listeDepartements.add(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        listeDepartements.remove(departement);
    }

    @Override
    public HashSet<Departement> getListeDepartements() {
        return listeDepartements;
    }
}
