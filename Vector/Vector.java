public class Vector {
    
    private Rational[] tab;

    public Vector(int size) {
        this.tab = new Rational[size];
    }

    public String toString() {
        int size = this.tab.length;

        if (size == 0) {
            return "( )";
        }
        
        String s = "";

        for (int i = 0; i < size - 1; i++) {
            s += tab[i].toString() + ", ";
        }

        return "( " + s + tab[size - 1].toString() + " )";
    }

    public void set(int i, Rational r) {
        if (i >= this.tab.length) {
            throw new IndexOutOfBoundsException();
        }

        this.tab[i] = new Rational(r);
    }

    public Rational get(int i) {
        if (i >= this.tab.length) {
            throw new IndexOutOfBoundsException();
        }

        return new Rational(this.tab[i]);
    }

    public void mult(Rational r) {
        for (int i = 0; i < this.tab.length; i++) {
            this.tab[i].mult(r);
        }
    }

    public void add(Vector other) {
        int size = this.tab.length;

        if (other.tab.length != size) {
            throw new IllegalArgumentException("The vectors must have the same size");
        }

        for (int i = 0; i < size; i++) {
            this.tab[i].add(other.tab[i]);
        }
    }
}
