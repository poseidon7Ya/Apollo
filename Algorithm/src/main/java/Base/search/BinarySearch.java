package Base.search;

public class BinarySearch extends AbstractSearch {
    @Override
    public int biSearch(int[] a, int n, int target) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
