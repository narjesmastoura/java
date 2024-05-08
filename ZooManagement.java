import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 6
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Zoo myZoo = new Zoo("Mon zoo", "Paris", 25);

        // Instruction 8
        myZoo.displayZoo();

        // Ajouter l'animal au zoo
        myZoo.addAnimal(lion);

        // Afficher les animaux du zoo
        System.out.println("\nAnimaux du zoo :");
        myZoo.displayAnimals();

        // Instruction 10
        // Ajouter plus d'animaux que le nombre maximal de cages dans le zoo
        for (int i = 0; i < 30; i++) {
            myZoo.addAnimal(new Animal("Félin", "Tigre", 4, true));
        }

        // Afficher les animaux du zoo
        System.out.println("\nAnimaux du zoo après dépassement :");
        myZoo.displayAnimals();

        // Instruction 11
        // Recherche d'un animal dans le zoo
        Animal searchedAnimal = new Animal("Félin", "Lion", 5, true);
        int index = myZoo.searchAnimal(searchedAnimal);
        if (index != -1) {
            System.out.println("\nAnimal trouvé à l'indice : " + index);
        } else {
            System.out.println("\nAnimal non trouvé dans le zoo.");
        }

        // Instruction 13
        // Suppression d'un animal du zoo
        myZoo.removeAnimal(lion);
        System.out.println("\nAnimaux du zoo après suppression :");
        myZoo.displayAnimals();
    }
}