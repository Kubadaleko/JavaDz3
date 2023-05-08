// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arry1 = new int[] { 21, 20, 24, 40 };
        int[] arry2 = new int[] { 10, 11, 4, 50, 65 };
        int[] arry3 = new int[arry1.length + arry2.length];
        Arrays.sort(arry1);
        Arrays.sort(arry2);
        int i = 0, j = 0;
        for (int k = 0; k < arry3.length; k++) {
            if (i > arry1.length - 1) {
                int a = arry2[j];
                arry3[k] = a;
                j++;
            } else if (j > arry2.length - 1) {
                int a = arry1[i];
                arry3[k] = a;
                i++;
            } else if (arry1[i] < arry2[j]) {
                int a = arry1[i];
                arry3[k] = a;
                i++;
            } else {
                int b = arry2[j];
                arry3[k] = b;
                j++;
            }
        }
        System.out.println(Arrays.toString(arry3));
    }
}
