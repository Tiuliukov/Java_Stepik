package chapter_2;

public class doubleExpr {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a+b)-c)<1e-4;
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }
}
