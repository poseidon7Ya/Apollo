package Base.sort;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] a = new int[]{6, 5, 4, 3, 1, 2, 0, 11, 12, 23};
        sort(new QuickSort(), a);
        sort2(a);
    }

    public static void sort(Sort sort, int[] a) {
        System.out.println("====================sort1====================");
        sort.sort(a);
        print(a);
    }

    public static void sort2(int[] a) {
        Arrays.sort(a);
        System.out.println("====================Arrays.sort()====================");
        print(a);
    }

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
