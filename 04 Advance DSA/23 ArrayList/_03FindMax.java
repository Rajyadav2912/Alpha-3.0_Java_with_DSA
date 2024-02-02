import java.util.ArrayList;

public class _03FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            Max = Math.max(Max, list.get(i));
        }
        System.out.println("Maximun value on list is: " + Max);
    }
}
