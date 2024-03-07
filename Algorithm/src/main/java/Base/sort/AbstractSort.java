package Base.sort;

public abstract class AbstractSort implements Sort {
    public static void swap(int i, int j, int[] a) {
        if (a.length <= 1) return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public abstract void sortArr(int[] a, int n);

    @Override
    public void sort(int[] a) {
        int n = a.length;
        if (n <= 1) return;
        sortArr(a, n);
    }
}
