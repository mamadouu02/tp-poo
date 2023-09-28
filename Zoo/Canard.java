public class Canard extends Animal {
    
    private String couleurPlume;

    public Canard(String nom, int poids, String couleurPlume) {
        super(nom, poids);
        this.couleurPlume = couleurPlume;
    }

    public String getCouleurPlume() {
        return this.couleurPlume;
    }

    @Override
    public String crier() {
        super.crier();
        System.out.println("Ce canard de " + this.getPoids() + "kg aux belles plumes " + this.couleurPlume + " !");
    }
}
