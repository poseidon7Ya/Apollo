package Base.sort;

/**
 * 归并排序
 */
public class MergeSort extends AbstractSort {
    @Override
    public void sortArr(int[] a, int n) {
        mergeSort(a, 0, n - 1);
    }

    public void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) >>> 1;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        mergeArr(a, l, m, r);
    }


}
