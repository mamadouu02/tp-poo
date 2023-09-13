public class TestRational {
    
    public static void main(String[] args) {
        Rational ratio = new Rational(3, 2);
        System.out.println("ratio.num : " + ratio.getNum());
        System.out.println("ratio.denom : " + ratio.getDenom());
        System.out.println("ratio : " + ratio.toString());
        Rational other = new Rational(1, 3);
        ratio.mult(other);
        System.out.println("ratio : " + ratio.toString());
        ratio.add(other);
        System.out.println("ratio : " + ratio.toString());
    }
}
