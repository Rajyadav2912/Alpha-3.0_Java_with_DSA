
// Time Complexity = O(Log n)

public class _03SearchRotatedSortedArr {
    public static int SearchRotatedArray(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        int mid = (si + ei) / 2;

        // case Found
        if (arr[mid] == target) {
            return mid;
        }

        // case 1 - left
        if (arr[si] <= arr[mid]) {
            // case - a Left
            if (arr[si] <= target && target <= arr[mid]) {
                return SearchRotatedArray(arr, target, si, mid - 1);
            } // case - b Right
            else {
                return SearchRotatedArray(arr, target, mid + 1, ei);
            }

            // case 2 - right
        } else {
            // case - c Right
            if (arr[mid] <= target && target <= arr[ei]) {
                return SearchRotatedArray(arr, target, mid + 1, ei);
            } // case - d Left
            else {
                return SearchRotatedArray(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 0, 1, 2 };
        int target = 2;
        int TarIndx = SearchRotatedArray(arr, target, 0, arr.length - 1);
        System.out.println(TarIndx);
    }
}
