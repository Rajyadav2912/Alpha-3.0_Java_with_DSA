import java.util.Arrays;
import java.util.Collections;

public class _07Chocola_Problem {
    public static void main(String[] args) {

        // int n = 4, m = 6;
        Integer costVer[] = { 3, 2, 1 }; // m - 1
        Integer costHor[] = { 3, 2 }; // n - 1

        Arrays.sort(costVer, Collections.reverseOrder()); // sort in reverse order : 4, 3, 2, 1, 1
        Arrays.sort(costHor, Collections.reverseOrder()); // sort in reverse order : 4, 2, 1

        int H = 0, V = 0;
        int HP = 1, VP = 1; // HP = Horizontal Plane / VP = Vertical Plane
        int Cost = 0;

        while (H < costHor.length && V < costVer.length) {
            if (costVer[V] <= costHor[H]) {
                Cost += (costHor[H] * VP);
                HP++;
                H++;
            } else {
                Cost += (costVer[V] * HP);
                VP++;
                V++;
            }
        }

        while (H < costHor.length) {
            Cost += (costHor[H] * VP);
            HP++;
            H++;
        }

        while (V < costVer.length) {
            Cost += (costVer[V] * HP);
            VP++;
            V++;
        }

        System.out.println("Minimum Cost of  Cuts: " + Cost);
    }
}