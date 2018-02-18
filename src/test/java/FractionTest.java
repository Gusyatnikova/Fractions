import org.junit.Assert;
import org.junit.Test;

public class FractionTest {
    @Test
    public void shouldAddFraction() {
        Fraction f1 = new Fraction(7.0, 3.0);
        Fraction f2 = new Fraction(3.0, 9.0);

        Fraction result = f1.additionFractions(f2);
        Assert.assertEquals(72, result.getNumerator(), 0.001);
        Assert.assertEquals(27, result.getDenominator(), 0.001);
    }
    @Test
    public void shouldSubFraction() {
        Fraction f1 = new Fraction(7.0, 3.0);
        Fraction f2 = new Fraction(3.0, 9.0);

        Fraction result = f1.subtractionFractions(f2);
        Assert.assertEquals(54, result.getNumerator(), 0.001);
        Assert.assertEquals(27, result.getDenominator(), 0.001);
    }

    @Test
    public void shouldMultiplyFraction() {
        Fraction f1 = new Fraction(7.0, 3.0);
        Fraction f2 = new Fraction(3.0, 9.0);

        Fraction result = f1.multiplyFractions(f2);
        Assert.assertEquals(21, result.getNumerator(), 0.001);
        Assert.assertEquals(27, result.getDenominator(), 0.001);
    }

    @Test
    public void shouldDevtiplyFraction() {
        Fraction f1 = new Fraction(7.0, 3.0);
        Fraction f2 = new Fraction(3.0, 9.0);

        Fraction result = f1.divisionFractions(f2);
        Assert.assertEquals(63, result.getNumerator(), 0.001);
        Assert.assertEquals(9, result.getDenominator(), 0.001);
    }


}
