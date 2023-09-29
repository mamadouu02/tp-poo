public class Vache extends Animal {
    
    private int nbTaches;

    public Vache(String nom, int poids, int nbTaches) {
        super(nom, poids);
        setNbTaches(nbTaches);
        setRegime(new Regime("herbe", 0.5));
        setQte(0.1 * getPoids());
    }

    public int getNbTaches() {
        return this.nbTaches;
    }

    public void setNbTaches(int nbTaches) {
        if (nbTaches < 0) {
            throw new IllegalArgumentException();
        }
        
        this.nbTaches = nbTaches;
    }

    @Override
    public void crier() {
        System.out.println(this.getNom() + ", la vache à " + this.getNbTaches() + " taches qui tache, crie... il meugle");
    }

    @Override
    public String toString() {
        return super.toString() + " est une vache à " + this.nbTaches + " taches";
    }
}
