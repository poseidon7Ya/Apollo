package Base.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtil.swap(j, j + 1, arr);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
