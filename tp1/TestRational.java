public class TestRational {
    
    public static void main(String[] args) {
        Rational r = new Rational(3, 2);
        System.out.println("r.num = " + r.getNum());
        System.out.println("r.denom = " + r.getDenom());
        System.out.println("r = " + r);
        Rational other = new Rational(1, 3);
        r.mult(other);
        System.out.println("3 / 2 + 1 / 3 = " + r);
        r.add(other);
        System.out.println("1 / 2 + 1 / 3 = " + r);
    }
}
