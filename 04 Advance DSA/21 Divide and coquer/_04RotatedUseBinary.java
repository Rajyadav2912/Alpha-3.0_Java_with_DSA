
// Time Complexity = O(Log n)

public class _04RotatedUseBinary {
    public static int SearchBinary(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;

        int mid = (si + ei) / 2;

        while (si <= ei) {
            mid = (si + ei) / 2;

            // Found Target
            if (arr[mid] == target) {
                return mid;
            }
            // left
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= target && target <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } // right
            else {
                if (arr[mid] <= target && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8, 0, 1, 2 };
        int target = 1;
        int TarIndx = SearchBinary(arr, target);
        System.out.println(TarIndx);
    }
}
