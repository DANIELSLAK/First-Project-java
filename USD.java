public class USD extends Coin {
    private Double Usd_value = 3.52;
    @Override
    public double getValue() {
        return Usd_value;

    }

    @Override
    public double calculate(double value) {
        return value * Usd_value;
    }
}