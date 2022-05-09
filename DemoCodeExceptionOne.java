
public class DemoCodeExceptionOne {


    public static double div(int a, int b) {
        return a * 1. / b;
    }
    public static void main(String[] args) {
        System.out.println(div(5, 2));
        System.out.println(div(5, 0));
    }
}
