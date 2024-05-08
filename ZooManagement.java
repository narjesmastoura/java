import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        // Instruction 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de cages :");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide :");
            scanner.next();
        }
        nbrCages = scanner.nextInt();

        System.out.println("Entrez le nom du zoo :");
        zooName = scanner.next();

        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Nom du zoo : " + zooName);

        // Instruction 3
        System.out.println("Changements effectués : " + zooName + " comporte " + nbrCages + " cages");
    }
}
