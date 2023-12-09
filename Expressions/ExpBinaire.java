public abstract class ExpBinaire extends ExpAbstraite {
    
    private ExpAbstraite opGauche;
    private ExpAbstraite opDroit;
    private String operator;

    public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroit, String operator) {
        this.opGauche = opGauche;
        this.opDroit = opDroit;
        setOperator(operator);
    }

    public ExpAbstraite getOpGauche() {
        return this.opGauche;
    }

    public ExpAbstraite getOpDroit() {
        return this.opDroit;
    }

    public void setOperator(String operator) {
        this.operator = " " + operator + " ";
    }

    @Override
    public String toStringInfixe() {
        return "(" + opGauche.toStringInfixe() + operator + opDroit.toStringInfixe() + ")";
    }
}
