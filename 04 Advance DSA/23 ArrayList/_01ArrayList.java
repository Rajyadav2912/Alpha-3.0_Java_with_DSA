import java.util.ArrayList;

public class _01ArrayList {
    public static void main(String[] args) {
        // classname = ArrayList ||Premitive data type = Integer || Object name = list
        // heap memory = new || <> () Angular brackest
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element in Arraylist
        list.add(1); // TC = O(1) constant
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.add(1, 5); // TC = O(n) linear
        System.out.println("Add: " + list);

        // how to know what element place in ith index
        // use .get function
        // TC = O(1) constant

        int Element = list.get(2);
        System.out.println("Get: " + Element);

        // the fuc. is only remove index element in list
        // TC = O(n) linear

        list.remove(3);
        System.out.println("Remove list ele: " + list);

        // this fuc. is only use for set indx no. then placed element in list
        // TC = O(n) linear

        list.set(2, 10);
        System.out.println("Set indx then placed elemt: " + list);

        // this func is only use our elem. exist in list or not
        // TC = O(n) linear

        System.out.println(list.contains(1));
        System.out.println(list.contains(14));

        // this func. is only use our size of list
        System.out.println("List Size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Reverse order list

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
