public class Animal {

    private String nom;
    private int poids;
    private Regime regime = new Regime("non spécifié", 0.0);
    private double qte;

    public Animal(String nom, int poids) {
        this.nom = nom;
        setPoids(poids);
    }

    public String getNom() {
        return this.nom;
    }

    public int getPoids() {
        return this.poids;
    }

    public void setPoids(int poids) {
        if (poids < 0) {
            throw new IllegalArgumentException();
        }
        
        this.poids = poids;
    }

    public void setRegime(Regime regime) {
        this.regime = new Regime(regime);
    }

    public void setQte(double qte) {
        if (qte < 0) {
            throw new IllegalArgumentException();
        }

        this.qte = qte;
    }

    public void crier() {
        System.out.println(this.nom + " crie ...");
    }

    public double calculCout() {
        return this.qte * this.regime.getPrixKg();
    }

    @Override
    public String toString() {
        return "L'animal " + this.nom + " (" + this.poids + " kg)";
    }
}
