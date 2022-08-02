package chapter_2;
import java.math.*;

public class intFactorial {
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {

        System.out.println(factorial(3));
    }
}
