package chapter_2;

public class mergeArr {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length-1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3; // your implementation here
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, -7, 2, 8, 21, 22, 12, 4, 6 };
        int[] b = { 3, 4, -7, 2, 8, 21, 34, 12, -4, 4 };
        int [] res = mergeArrays(a, b);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
