//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création de quelques étudiants
        Etudiant etudiant1 = new Etudiant(1, "Alice", 20);
        Etudiant etudiant2 = new Etudiant(2, "Bob", 22);
        Etudiant etudiant3 = new Etudiant(3, "Charlie", 21);

        // Création d'une liste d'étudiants
        List<Etudiant> students = new ArrayList<>();
        students.add(etudiant1);
        students.add(etudiant2);
        students.add(etudiant3);

        // Création d'une instance de StudentManagement
        StudentManagement studentManagement = new StudentManagement();

        // Affichage de tous les étudiants
        System.out.println("Tous les étudiants :");
        studentManagement.displayStudents(students, System.out::println);

        // Affichage des étudiants dont l'âge est supérieur à 20 ans
        System.out.println("\nLes étudiants dont l'âge est supérieur à 20 ans :");
        studentManagement.displayStudentsByFilter(students, student -> student.getAge() > 20, System.out::println);

        // Retourner les noms des étudiants
        String studentNames = studentManagement.returnStudentsNames(students, Etudiant::getNom);
        System.out.println("\nLes noms des étudiants : " + studentNames);

        // Créer un nouvel étudiant
        Etudiant newStudent = studentManagement.createStudent(() -> new Etudiant(4, "David", 23));
        System.out.println("\nNouvel étudiant créé : " + newStudent);

        // Trier les étudiants par id
        studentManagement.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        System.out.println("\nLes étudiants triés par id :");
        studentManagement.displayStudents(students, System.out::println);
    }
}
