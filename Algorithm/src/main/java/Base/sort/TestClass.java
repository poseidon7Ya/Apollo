package Base.sort;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] a = new int[] {6,5,4,3,1,2,0,11,12,23};
        BubbleSort.BubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
