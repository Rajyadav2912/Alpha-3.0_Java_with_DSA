public class _09IsSorted {
    public static boolean IsSortedArr(int arr[], int i) {
        // base case
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return IsSortedArr(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        System.out.println(IsSortedArr(arr, 0));
    }
}
