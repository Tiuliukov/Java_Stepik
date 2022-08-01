package chapter_2;

public class leapYear {
    public static int leapYearCount(int year) {

        return year / 100 * 24 + (year % 100) / 4 + year / 400;
    }

    public static void main(String[] args) {
        System.out.println(leapYearCount(100));
    }
}
