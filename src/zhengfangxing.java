public class zhengfangxing extends Shape {
    private double biancheng;

    public zhengfangxing(double a) {
        this.biancheng = a;
    }

    @Override
    public double getArea() {

        return this.biancheng*this.biancheng;
    }
}
