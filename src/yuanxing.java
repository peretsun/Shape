public class yuanxing extends Shape{
    private double r=0;
    private final static double PI = 3.14;
    public yuanxing(double r){
        this.r = r;
    }
    @Override
    public double getArea() {
        return r*r*PI;
    }
}
