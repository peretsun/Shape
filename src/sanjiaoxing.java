
public class sanjiaoxing extends Shape {
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double h = 0;

    public sanjiaoxing(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public sanjiaoxing(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        if (h == 0) {
            double s = (a + b + c) / 2;
            return Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        } else {
            return (a * h / 2);
        }
    }
}