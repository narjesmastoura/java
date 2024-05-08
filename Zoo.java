package tn.esprit.gestionzoo.entities;

class Zoo {
   /* private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount; // Compteur d'animaux */
   private static final int NBR_CAGES_MAX = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages;
    private int animalCount;

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.setName(name); // Validation du nom
        this.city = city;
        this.nbrCages = NBR_CAGES_MAX;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }
    // Méthode pour restreindre l'accès au nom et valider sa valeur
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages du zoo : " + nbrCages);
    }

    // Méthode pour ajouter un animal au zoo
    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter un nouvel animal.");
            return false;
        }
    }
    // Méthode pour afficher les animaux du zoo
    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + (i + 1) + " : " + animals[i]);
        }
    }

    // Méthode pour rechercher un animal par son nom et retourner son indice
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            // Décaler les animaux suivants vers la gauche pour remplir l'emplacement vide
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null; // Supprimer la référence à l'animal
            animalCount--;
            return true;
        }
        return false;
    }
    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Méthode pour comparer deux zoos et retourner celui avec le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }
}

