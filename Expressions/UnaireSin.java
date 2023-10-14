public class UnaireSin extends ExpUnaire {

    public UnaireSin(ExpAbstraite op) {
        super(op);
        setOperator("sin");
    }

    @Override
    public double evaluer(Env env) {
        return Math.sin(getOp().evaluer(env));
    }
}
