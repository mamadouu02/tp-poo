public class BinaireMult extends ExpBinaire {

    public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
        setOperator("*");
    }

    @Override
    public double evaluer(Env env) {
        return getOpGauche().evaluer(env) * getOpDroit().evaluer(env);
    }
}
