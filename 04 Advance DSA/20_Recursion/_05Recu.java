
public class _05Recu {
    public static void reachHome(int sources, int destination) {
        System.out.println("Sources " + sources + " Destination " + destination);
        if (sources == destination) {
            System.out.println("Pucha gaya");
            return;
        }
        // processing -ek step bad gyaa
        sources++;

        // Recursive call
        reachHome(sources, destination);
    }

    public static void main(String[] args) {
        int destination = 10;
        int sources = 1;
        reachHome(sources, destination);
    }
}
