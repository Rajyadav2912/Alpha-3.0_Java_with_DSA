import java.util.ArrayList;

public class _05MultidimensionalList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

        ArrayList<ArrayList<Integer>> List = new ArrayList<>();

        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            List1.add(i * 1); // 1 , 2 , 3 , 4 , 5
            List2.add(i * 2); // 2 , 4 , 6 , 8, 10
            List3.add(i * 3); // 3 , 6 , 9 , 12, 15
        }

        List.add(List1);
        List.add(List2);
        List.add(List3);

        System.out.println(List);
    }
}
