public class Animal {

    private String nom;
    private int poids;

    public Animal(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPoids() {
        return this.poids;
    }

    public void crier() {
        System.out.println(this.nom + " crie ...");
    }

    @Override
    public String toString() {
        return "L'animal " + this.nom + " (" + this.poids + " kg)";
    }
}
