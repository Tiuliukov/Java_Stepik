package chapter_2;

public class flipB {
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }

    public static void main(String[] args) {
        System.out.println(flipBit(0, 1));
    }
}
