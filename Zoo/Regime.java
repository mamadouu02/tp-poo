public class Regime {
    
    private String nom;
    private double prixKg;

    public Regime(String nom, double prixKg) {
        this.nom = nom;
        setPrixKg(prixKg);
    }

    public Regime(Regime other) {
        this.nom = other.nom;
        setPrixKg(other.prixKg);
    }

    public String getNom() {
        return this.nom;
    }

    public double getPrixKg() {
        return this.prixKg;
    }

    public void setPrixKg(double prixKg) {
        if (prixKg < 0) {
            throw new IllegalArgumentException();
        }

        this.prixKg = prixKg;
    }
}
