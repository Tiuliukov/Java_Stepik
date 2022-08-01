package chapter_2;

public class booleanExpr {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) && (c ^ d)) || ((a ^ c) && (b ^ d)) || ((a ^ d) && (b ^ c));
    }

    public static void main(String[] args) {
        System.out.println(booleanExpression(false,false,  false,  false));
    }
}
