public class Rational {

    private int num;
    private int denom;

    public Rational(int num, int denom) {
        int gcd = Rational.gcd(num, denom);

        if (denom == 0) {
            throw new IllegalArgumentException("The denominator must be non-zero");
        }
        
        this.num = num / gcd;
        this.denom = denom / gcd;
    }

    public int getNum() {
        return this.num;
    }

    public int getDenom() {
        return this.denom;
    }

    public String toString() {
        return this.num + " / " + this.denom;
    }

    public void mult(Rational other) {
        this.num *= other.num;
        this.denom *= other.denom;
        this.reduce();
    }

    public void add(Rational other) {
        this.num = this.num * other.denom + other.num * this.denom;
        this.denom *= other.denom;
        this.reduce();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public void reduce() {
        int gcd = Rational.gcd(this.num, this.denom);

        if (gcd > 1) {
            this.num /= gcd;
            this.denom /= gcd;
        }
    }
}
