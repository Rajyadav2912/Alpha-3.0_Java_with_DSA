import java.util.ArrayList;

public class _07PairSum {
    public static boolean PairSum(ArrayList<Integer> List, int target) {
        for (int i = 0; i < List.size(); i++) {
            for (int j = i + 1; j < List.size(); j++) {
                if (List.get(i) + List.get(j) == target) {
                    System.out.println("index is : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    // Time Complexity = O(n) Linear Time
    public static boolean PairSum2Approch(ArrayList<Integer> List, int target) {

        int LeftPointer = 0;
        int RightPointer = List.size() - 1;

        while (LeftPointer != RightPointer) {
            if (List.get(LeftPointer) + List.get(RightPointer) == target) {
                return true;
            }

            else if (List.get(LeftPointer) + List.get(RightPointer) < target) {
                LeftPointer++;
            } else {
                RightPointer--;
            }
        }
        return false;
    }

    // Time Complexity = O(n) Linear Time
    public static boolean PairSum2(ArrayList<Integer> List, int target) {

        int BP = -1; // Break Point
        int n = List.size();
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) > List.get(i + 1)) {
                BP = i;
                break;
            }
        }

        int LeftPointer = BP + 1; // Smallest value in list
        int RightPointer = BP; // Largest value in list

        while (LeftPointer != RightPointer) {
            // case 1
            if (List.get(LeftPointer) + List.get(RightPointer) == target) {
                return true;
            }

            else if (List.get(LeftPointer) + List.get(RightPointer) < target) {
                LeftPointer = (LeftPointer + 1) % n;
            }

            else {
                RightPointer = (n + RightPointer - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);

        int target = 26;

        System.out.println(PairSum(List, target));
        // System.out.println(PairSum2Approch(List, target));
        // System.out.println(PairSum2(List, target));

    }
}
