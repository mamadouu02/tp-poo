public class BinaireDiv extends ExpBinaire {

    public BinaireDiv(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit, "/");
    }

    @Override
    public double evaluer(Env env) {
        if (getOpDroit().evaluer(env) == 0) {
            throw new IllegalArgumentException("The right argument must be non-zero");
        }

        return getOpGauche().evaluer(env) / getOpDroit().evaluer(env);
    }
}
