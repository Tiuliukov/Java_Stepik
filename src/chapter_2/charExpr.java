package chapter_2;

public class charExpr {
    public static char charExpression(int a) {
        return (char)('\\' + a);
    }

    public static void main(String[] args) {
        System.out.println(charExpression(32));
    }
}
