
public class _85InsertionSort {
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int Curr = arr[i];
            int Prev = i - 1;
            while (Prev >= 0 && arr[Prev] > Curr) {
                arr[Prev + 1] = arr[Prev];
                Prev--;
            }
            arr[Prev + 1] = Curr;
        }
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        InsertionSort(arr);
        Printarr(arr);
    }
}
