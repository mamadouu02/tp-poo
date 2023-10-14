public abstract class ExpAbstraite {

    public abstract String toStringInfixe();

    public abstract double evaluer(Env env);

    @Override
    public String toString() {
        return "Je suis une expression et me voila en notation infixée : " + this.toStringInfixe();
    }
}
