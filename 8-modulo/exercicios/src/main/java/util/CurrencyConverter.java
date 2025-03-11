package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convert(double price, double dollars) {
        double value = price * dollars;
        return value += value * IOF;
    }
}
