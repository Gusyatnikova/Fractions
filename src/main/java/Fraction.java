public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
    public Fraction(double numerator, double denominator) throws ArithmeticException {
        if(denominator == 0)
            throw new ArithmeticException("You can't use a zero for denominator");
        this.denominator = denominator;
        this.numerator = numerator;
    }
    public double getNumerator() {
        return this.numerator;
    }
    public double getDenominator() {
        return this.denominator;
    }
    public Fraction multiplyFractions (Fraction secondMultiplier) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * secondMultiplier.numerator;
        result.denominator = this.denominator * secondMultiplier.denominator;
        return  result;
    }
    public Fraction divisionFractions (Fraction divisor) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * divisor.denominator;
        result.denominator = this.denominator * divisor.numerator;
        return  result;
    }
    public Fraction subtractionFractions (Fraction subtrahend) {
        Fraction difference = new Fraction();
        difference.denominator = this.denominator*subtrahend.denominator;
        difference.numerator = this.numerator*subtrahend.denominator - subtrahend.numerator*this.denominator;
        return difference;
    }
    public Fraction additionFractions(Fraction secondAddent) {
        Fraction sum = new Fraction();
        sum.denominator = this.denominator*secondAddent.denominator;
        sum.numerator = this.numerator*secondAddent.denominator + secondAddent.numerator*this.denominator;
        return sum;
    }
}
