public class Constante extends ExpAbstraite implements Evaluable {

    private double valeur;

    public Constante(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toStringInfixe() {
        return String.valueOf(this.valeur);
    }

    @Override
    public double evaluer(Env env) {
        return this.valeur;
    }

    @Override
    public double evaluer() {
        return this.valeur;
    }
}
