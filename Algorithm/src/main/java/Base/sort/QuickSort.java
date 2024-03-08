package Base.sort;

public class QuickSort extends AbstractSort {
    @Override
    public void sortArr(int[] a, int n) {
        quickSort(a, 0, n - 1);
    }

    public void quickSort(int[] a, int l, int r) {
        if (l >= r) return;
        int q = partition(a, l, r);
        quickSort(a, l, q - 1);
        quickSort(a, q + 1, r);
    }
}
