import static java.lang.Math.pow;

public class Potenza {
    final double esponenete = 2;
    double base;

    public double getBase() {
        return pow(base, esponenete);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Potenza(double base) {
        this.base = base;
    }
}
