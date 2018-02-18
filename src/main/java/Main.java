
public class Main {
    public static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(3.0, 0.0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
