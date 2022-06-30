public class ILS extends Coin{
    private double Ils_value = 0.28;
    @Override
    public double getValue() {
        return Ils_value;
    }

    @Override
    public double calculate(double value) {
        return value * Ils_value;
    }
}
