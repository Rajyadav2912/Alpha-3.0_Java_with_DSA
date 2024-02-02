import java.util.ArrayList;
import java.util.Collections;

public class _04Swap2Num {

    public static void Swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("List: " + list); // List: [2, 5, 9, 3, 6]
        int indx1 = 1, indx2 = 3;
        Swap(list, indx1, indx2);

        System.out.println("After Swap list: " + list); // After Swap list: [2, 3, 9, 5, 6]

        Collections.sort(list);
        System.out.println(list); /// ascending order [2, 3, 5, 6, 9]

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);// Desending order [9, 6, 5, 3, 2]
    }
}
