public class Canard extends Animal {
    
    private String couleurPlumes;

    public Canard(String nom, int poids, String couleurPlume) {
        super(nom, poids);
        this.couleurPlumes = couleurPlume;
        setRegime(new Regime("graines", 0.25));
        setQte(1.0);
    }

    public String getCouleurPlumes() {
        return this.couleurPlumes;
    }

    @Override
    public void crier() {
        System.out.println(this.getNom() + " crie ... Ce canard de " + this.getPoids() + "kg aux belles plumes " + this.couleurPlumes + " !");
    }

    @Override
    public String toString() {
        return super.toString() + " est un canard aux plumes " + this.couleurPlumes;
    }
}
