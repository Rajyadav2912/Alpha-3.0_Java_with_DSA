public class _02QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        int pIdex = Partition(arr, si, ei);

        QuickSort(arr, si, pIdex - 1);
        QuickSort(arr, pIdex + 1, ei);
    }

    public static int Partition(int arr[], int si, int ei) {
        int Pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= Pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;

        int temp = Pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6, 1, 5 };
        QuickSort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
