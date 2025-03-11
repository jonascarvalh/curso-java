package entities;

public class Triangle {

    public double sideA;
    public double sideB;
    public double sideC;

    public double surface() {
        double p = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
