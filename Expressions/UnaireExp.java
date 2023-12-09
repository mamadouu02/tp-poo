public class UnaireExp extends ExpUnaire {
    
    public UnaireExp(ExpAbstraite op) {
        super(op, "exp");
    }

    @Override
    public double evaluer(Env env) {
        return Math.exp(getOp().evaluer(env));
    }
}
