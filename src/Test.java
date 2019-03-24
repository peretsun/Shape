public class Test {
    public static void main(String[] args) {
        Shape zhengfangxing1 = new zhengfangxing(3);
        Shape yuanxing1 = new yuanxing(2);
        Shape sanjiaoxing1 = new sanjiaoxing(3,4,5);

        System.out.println(zhengfangxing1.getArea());
        System.out.println(yuanxing1.getArea());
        System.out.println(sanjiaoxing1.getArea());
    }
}
