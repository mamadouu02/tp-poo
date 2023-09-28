public class TestVector {
    
    public static void main(String[] args) {
        Vector v = new Vector(2);
        v.set(0, new Rational(0));
        v.set(1, new Rational(0));
        Rational a = new Rational(2, 3);
        v.set(0, a);
        System.out.println("v = " + v);
        Rational b = new Rational(3, 2);
        a.mult(b);
        System.out.println("v = " + v);
        
        Vector u = new Vector(2);
        u.set(0, new Rational(1, 2));
        u.set(1, new Rational(1, 2));
        System.out.println("u = " + u);
        Rational c = u.get(0);
        c.mult(new Rational(1, 3));
        System.out.println("u = " + u);

        v.mult(b);
        System.out.println("v = " + v);
        v.add(u);
        System.out.println("v = " + v);
    }
}
