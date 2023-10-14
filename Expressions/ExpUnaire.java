public abstract class ExpUnaire extends ExpAbstraite {

    private ExpAbstraite op;
    private String operator;
    
    public ExpUnaire(ExpAbstraite op) {
        this.op = op;
    }

    public ExpAbstraite getOp() {
        return this.op;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toStringInfixe() {
        return operator + op.toStringInfixe();
    }
}
