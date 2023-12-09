public class RationalEvaluable extends Rational implements Evaluable {

    public RationalEvaluable(int num, int denom) {
        super(num, denom);
    }

    public RationalEvaluable(int n) {
        super(n);
    }

    public RationalEvaluable(RationalEvaluable other) {
        super(other);
    }

    @Override
    public double evaluer() {
        return this.toDouble();
    }
}
