import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _01ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorting
        int Activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            Activities[i][0] = i;
            Activities[i][1] = start[i];
            Activities[i][2] = end[i];
        }

        // Lambda Function -> ShortForm
        Arrays.sort(Activities, Comparator.comparingDouble(o -> o[2]));

        // End time Basis sorted
        int Max_Activity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        Max_Activity = 1;
        ans.add(Activities[0][0]); // .add(0)
        // Last Act. ending time
        int LastEnd = Activities[0][2]; // end[0]

        for (int i = 1; i < end.length; i++) {
            // currAct st time >= Last Ending time true Not Overlape False Overlape
            if (Activities[i][1] >= LastEnd) {
                // activity select
                Max_Activity++;
                ans.add(Activities[i][0]); // .add(start[i]);
                LastEnd = Activities[i][2];// .add(end[i]);
            }
        }
        System.out.println("Maximum Activities: " + Max_Activity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Activity: " + ans.get(i) + " ");
            /*
             * Maximum Activities: 4, Activity: 0, Activity: 1, Activity: 3, Activity: 4
             */
        }
        System.out.println();
    }
}
