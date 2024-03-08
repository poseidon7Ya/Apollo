package Base;

import Base.search.BinarySearch;
import Base.search.Search;
import Base.sort.QuickSort;
import Base.sort.Sort;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] a = new int[]{6, 5, 4, 3, 1, 2, 0, 11, 12, 23};
//        sort(new QuickSort(), a);
//        sort2(a);
        biS(new BinarySearch(), a, 23);
    }

    public static void biS(Search search, int[] a, int target) {
        System.out.println(search.search(a, target));
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
