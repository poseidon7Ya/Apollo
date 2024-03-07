package Base.sort;

public class SortUtil {
    public static void swap(int i, int j, int[] a) {
        if (a.length <= 1) return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
