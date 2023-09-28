public class TestExtensibleVector {
    
    public static void main(String[] args) {
        ExtensibleVector v = new ExtensibleVector();
        v.append(new Rational(1, 2));
        v.append(new Rational(1, 3));
        v.append(new Rational(1, 4));
        System.out.println("v = " + v);
        System.out.println("v.size = " + v.getDimension());
        System.out.println("v[1] = " + v.get(1));
    }
}
