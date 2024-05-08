package tn.esprit.gestionzoo.entities;

class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }


    // Méthode pour restreindre l'accès à l'âge et valider sa valeur
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge de l'animal ne peut pas être négatif.");
        }
    }
}