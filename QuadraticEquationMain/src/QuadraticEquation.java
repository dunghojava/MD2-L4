public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        delta = (this.b * this.b - 4 * this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

}
