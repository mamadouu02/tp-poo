public class UnaireCos extends ExpUnaire {

    public UnaireCos(ExpAbstraite op) {
        super(op, "cos");
    }

    @Override
    public double evaluer(Env env) {
        return Math.cos(getOp().evaluer(env));
    }
}
