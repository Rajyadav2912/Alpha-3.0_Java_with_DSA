public class _11Ist_lastOccurance {
    public static int firstoccurance(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurance(arr, key, i + 1);
    }

    public static int lastoccurance(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return -1;
        }

        int isfound = lastoccurance(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 5, 3, 5, 2, 1 };
        System.out.println(firstoccurance(arr, 1, 0));
        // System.out.println(lastoccurance(arr, 5, 0));
    }
}
