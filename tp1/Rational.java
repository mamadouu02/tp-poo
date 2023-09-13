public class Rational {

    private int num;
    private int denom;

    public Rational(int num, int denom) {
        int gcd = pgcd(num, denom);

        if (denom != 0)
            this.denom = denom / gcd;
        else
            throw new IllegalArgumentException("Le dénominateur doit être non nul !");
        
        this.num = num / gcd;
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

    public int pgcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return pgcd(b, a % b);
    }

    public void reduce() {
        int gcd = pgcd(this.num, this.denom);

        if (gcd > 1)
            this.num /= gcd;
            this.denom /= gcd;
    }
}
