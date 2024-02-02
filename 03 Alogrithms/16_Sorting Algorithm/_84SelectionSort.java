
public class _84SelectionSort {
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int MIN_POS = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[MIN_POS]) {
                    MIN_POS = j;
                }
            }
            // swap
            int temp = arr[MIN_POS];
            arr[MIN_POS] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        SelectionSort(arr);
        Printarr(arr);
    }
}
