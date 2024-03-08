package Base.sort;

/**
 * 冒泡排序
 */
public class BubbleSort extends AbstractSort {
    @Override
    public void sortArr(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
